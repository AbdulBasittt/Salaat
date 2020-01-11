package com.example.salaat.ui.SearchCity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.salaat.AppController;
import com.example.salaat.R;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.json.JSONException;
import org.json.JSONObject;

public class SearchCityFragment extends Fragment {
TextView fajar_tv,zuhr_tv,asar_tv,maghrib_tv,isha_tv,shurooq_tv;
ImageView search;
EditText search_ed;
AdView adView;
    String tag_json_obj = "json_obj_req";
    String mSearch;
    String url ="https://muslimsalat.com/"+mSearch+".json?key=60c03738feea40dabf3580e87d537261";
    ProgressBar progressBar;
    private SearchCityViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(SearchCityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_searchcity, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        MobileAds.initialize(getContext(),"ca-app-pub-3940256099942544~3347511713");
        adView=root.findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        fajar_tv=root.findViewById(R.id.fajartv);
        zuhr_tv=root.findViewById(R.id.zuhrtv);
        asar_tv=root.findViewById(R.id.asartv);
        maghrib_tv=root.findViewById(R.id.maghribtv);
        isha_tv=root.findViewById(R.id.ishatv);
        progressBar = (ProgressBar)root.findViewById(R.id.spin_kit);
        Sprite doubleBounce = new DoubleBounce();
        progressBar.setIndeterminateDrawable(doubleBounce);
        search=(ImageView)root.findViewById(R.id.search_button);
        search_ed=root.findViewById(R.id.searchbox);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mSearch=search_ed.getText().toString();
            if (TextUtils.isEmpty(mSearch)){
                search_ed.setError("Field Required");
                search_ed.requestFocus();
            }
            else{

                url ="https://muslimsalat.com/"+mSearch+".json?key=60c03738feea40dabf3580e87d537261";
                searchLocation();
            }
            }
        });

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

    private void searchLocation() {
        progressBar.setVisibility(View.VISIBLE);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {
////



                            //get namaz timming
                            String mFajar = response.getJSONArray("items").getJSONObject(0).get("fajr").toString();
                            String mDhuhr = response.getJSONArray("items").getJSONObject(0).get("dhuhr").toString();
                            String mAsr = response.getJSONArray("items").getJSONObject(0).get("asr").toString();
                            String mMaghrib = response.getJSONArray("items").getJSONObject(0).get("maghrib").toString();
                            String mIsha = response.getJSONArray("items").getJSONObject(0).get("isha").toString();

                            fajar_tv.setText(mFajar);
                            zuhr_tv.setText(mDhuhr);
                            asar_tv.setText(mAsr);
                            maghrib_tv.setText(mMaghrib);
                            isha_tv.setText(mIsha);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Error", "Error: " + error.getMessage());
                // hide the progress dialog
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
// Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

    }


}






















