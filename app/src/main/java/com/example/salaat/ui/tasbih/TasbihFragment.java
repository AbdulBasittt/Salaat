package com.example.salaat.ui.tasbih;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.salaat.R;

import hiennguyen.me.circleseekbar.CircleSeekBar;

public class TasbihFragment extends Fragment implements CircleSeekBar.OnSeekBarChangedListener {
    public static final String TAG="Tasbih";
    String addcount;
    int Integervalue;
    private SendViewModel sendViewModel;
    private int mCounter=0;
    Button countbtn;
    TextView countv;
    CircleSeekBar circleSeekBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tasih, container, false);
        final TextView textView = root.findViewById(R.id.text_send);
        circleSeekBar=(CircleSeekBar)root.findViewById(R.id.circular);
        circleSeekBar.setSeekBarChangeListener(TasbihFragment.this);
        circleSeekBar.setProgressDisplayAndInvalidate(13);
        countbtn=(Button)root.findViewById(R.id.button_count);
        countbtn.setBackgroundColor(Color.TRANSPARENT);
        countv=root.findViewById(R.id.tv_count);
        setHasOptionsMenu(true);//enable menu option
        countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
                countbtn.startAnimation(myAnim);
                Counter();
            }
        });
        sendViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    /*==========================================*/
    /*working on menu option*/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_reset:
                RESET_DIALOGUE();
                return true;

                default:
        }
        return super.onOptionsItemSelected(item);
    }

    private void COUNT_33() {

    }

    private void COUNT_99() {

        for (int i=0;i<=99;i++){
            Log.d(TAG, "COUNT_99: "+i);
        }
    }

    private void RESET_DIALOGUE() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        builder1.setMessage("Reset your current counts to zero?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Reset",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        countv.setText(Integer.toString(0));

                    }
                });

        builder1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    /*==========================================*/
    /*this will add menu in this layout*/
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.resetbutton,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private void Counter() {
         addcount=countv.getText().toString();
        int Integervalue=Integer.parseInt(addcount);
        Integervalue++;
        circleSeekBar.setProgressDisplayAndInvalidate(Integervalue);
        Log.d(TAG, "Counter: "+Integervalue);
        countv.setText(Integer.toString(Integervalue));
    }

    @Override
    public void onPointsChanged(CircleSeekBar circleSeekBar, int points, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(CircleSeekBar circleSeekBar) {

    }

    @Override
    public void onStopTrackingTouch(CircleSeekBar circleSeekBar) {

    }
}












