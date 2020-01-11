package com.example.salaat.ui.Qibla;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salaat.M_NamesAdapter;
import com.example.salaat.M_NamesModel;
import com.example.salaat.NameAdapter;
import com.example.salaat.NamesModel;
import com.example.salaat.R;

import java.util.ArrayList;
import java.util.List;

public class QiblaFragment extends Fragment {
   RecyclerView recyclerView;
   List<M_NamesModel> list;
    private QiblaViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(QiblaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qibla, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        recyclerView=root.findViewById(R.id.recycler_vieww);
        M_NamesAdapter recyclerViewAdapter = new M_NamesAdapter(getContext(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        list=new ArrayList<>();
        list.add(new M_NamesModel("Aadil","The Justice",R.drawable.muhammad,"عادل"));
        list.add(new M_NamesModel("Aalim","The Scholar",R.drawable.muhammad,"عالم"));
        list.add(new M_NamesModel("Abdullah","Slave of Allah",R.drawable.muhammad,"عبدالله"));
        list.add(new M_NamesModel("Abu al Qaasi","The father of Qasim.",R.drawable.muhammad,"ابوالقاسم"));
        list.add(new M_NamesModel("Abu at Tahir","The father of Tahir.",R.drawable.muhammad,"ابو الطاھر"));
        list.add(new M_NamesModel("Abu at Tayyib","The father of Tayyib.",R.drawable.muhammad,"ابوالطیب"));
        list.add(new M_NamesModel("Abu Ibrahim","The father of Ibrahim.",R.drawable.muhammad,"ابو ابراھیم"));
        list.add(new M_NamesModel("Afoow","Forgiver",R.drawable.muhammad,"عفو"));
        list.add(new M_NamesModel("Aheed","He who takes to one side.",R.drawable.muhammad,"احید"));
        list.add(new M_NamesModel("Ahmad","Much praised",R.drawable.muhammad,"احمد"));
        list.add(new M_NamesModel("Ajeer","He who is rewarded.",R.drawable.muhammad,"اجیر"));
        list.add(new M_NamesModel("Alam ul Eeman","The banner of faith.",R.drawable.muhammad,"علم الایمان"));
        list.add(new M_NamesModel("Alam ul Yaqeen","The banner of belief.",R.drawable.muhammad,"علم الیقین"));
        list.add(new M_NamesModel("Alamul Hudaa","Banner of guidance.",R.drawable.muhammad,"علم الھدیٰ"));
        list.add(new M_NamesModel("Aleem","The Knowledgeable",R.drawable.muhammad,"علیم"));
        list.add(new M_NamesModel("Ameen","The Honest One",R.drawable.muhammad,"امین"));
        list.add(new M_NamesModel("An Najm-us-Saqib","Shining star.",R.drawable.muhammad,"النجم الثاقب"));
        list.add(new M_NamesModel("Aqib","The Latest",R.drawable.muhammad,"عاقب"));
        list.add(new M_NamesModel("Arabi","The Arabi",R.drawable.muhammad,"عربی"));
        list.add(new M_NamesModel("Awwal","The First",R.drawable.muhammad,"اول"));
        list.add(new M_NamesModel("Ayn ul Ghurr","The chief of the chosen one.",R.drawable.muhammad,"عین الغر"));
        list.add(new M_NamesModel("Ayn un Naeem","The spring of blessing.",R.drawable.muhammad,"عین النعیم"));
        list.add(new M_NamesModel("Aziz","The Honoured One",R.drawable.muhammad,"عزیز"));
        list.add(new M_NamesModel("Baaligh","He who attains the elevated station",R.drawable.muhammad,"بالغ"));
        list.add(new M_NamesModel("Bar","Pious",R.drawable.muhammad,"بار"));
        list.add(new M_NamesModel("Basheer","The Messenger of Good News",R.drawable.muhammad,"بشیر"));
        list.add(new M_NamesModel("Bayan","Obvious words",R.drawable.muhammad,"بیان"));
        list.add(new M_NamesModel("Burhan","The Evidence",R.drawable.muhammad,"برھان"));
        list.add(new M_NamesModel("Bushraa","Giver of good tidings.",R.drawable.muhammad,"بشریٰ"));
        list.add(new M_NamesModel("Daa","The Invitor",R.drawable.muhammad,"داع"));
        list.add(new M_NamesModel("Daleel ul Khyayraat","To guide to virtue.",R.drawable.muhammad,"دلیل الخیرات"));
        list.add(new M_NamesModel("Faateh","The Victor",R.drawable.muhammad,"فاتح"));
        list.add(new M_NamesModel("Faazil","Virtuous.",R.drawable.muhammad,"فاضل"));
        list.add(new M_NamesModel("Faseehul Lisaan","The eloquent of speech.",R.drawable.muhammad,"فصیح اللسان"));
        list.add(new M_NamesModel("Fatah","The Successor, ",R.drawable.muhammad,"فتاح"));
        list.add(new M_NamesModel("Ghani","The Rich",R.drawable.muhammad,"غنی"));
        list.add(new M_NamesModel("Gharib","The Poor",R.drawable.muhammad,"غریب"));
        list.add(new M_NamesModel("Ghaus","Succour, ",R.drawable.muhammad,"غوث"));
        list.add(new M_NamesModel("Ghays","Shower of mercy.",R.drawable.muhammad,"غیث"));
        list.add(new M_NamesModel("Ghiyaas","Full of succour.",R.drawable.muhammad,"غیاث"));
        list.add(new M_NamesModel("Haad","The Leader",R.drawable.muhammad,"ھاد"));
        list.add(new M_NamesModel("Habeebullah","Beloved of Allah.",R.drawable.muhammad,"حبیب الله"));
        list.add(new M_NamesModel("Habieb","The Beloved",R.drawable.muhammad,"حبیب"));
        list.add(new M_NamesModel("Hafeey","Very merciful.",R.drawable.muhammad,"حفی"));
        list.add(new M_NamesModel("Hafiz","The Guardian",R.drawable.muhammad,"حافظ"));
        list.add(new M_NamesModel("Hakeem","The Wise",R.drawable.muhammad,"حکیم"));
        list.add(new M_NamesModel("Hamid","The Praiser",R.drawable.muhammad,"حامد"));
        list.add(new M_NamesModel("Hamied","The Thankful",R.drawable.muhammad,"حمید"));
        list.add(new M_NamesModel("Haq","The True,",R.drawable.muhammad,"حق"));
        list.add(new M_NamesModel("Harees-un-Alaikum","The Covetous for the Believers",R.drawable.muhammad,"حریص علیکم"));
        list.add(new M_NamesModel("Hashim","The Destroyer, ",R.drawable.muhammad,"ھاشم"));
        list.add(new M_NamesModel("Hashir","The Awakener",R.drawable.muhammad,"حاشر"));
        list.add(new M_NamesModel("Hashmi","The Hashmi",R.drawable.muhammad,"ھاشمے"));
        list.add(new M_NamesModel("Hidayatullah","Gift of Allah.",R.drawable.muhammad,"ھدیه الله"));
        list.add(new M_NamesModel("Hijazi","The Hijazi",R.drawable.muhammad,"حجازی"));
        list.add(new M_NamesModel("Hizbullah","Army of Allah.",R.drawable.muhammad,"حزب الله"));
        list.add(new M_NamesModel("Hudaa","Guide.",R.drawable.muhammad,"ھدی"));
        list.add(new M_NamesModel("Hujjat","The Right Argument",R.drawable.muhammad,"حجه"));
        list.add(new M_NamesModel("Ikleel","Chief (of Prophets)",R.drawable.muhammad,"اکلیل"));
        list.add(new M_NamesModel("Imam","The Guide",R.drawable.muhammad,"امام"));
        list.add(new M_NamesModel("Imamul Muttaqeen","Leader of the pious.",R.drawable.muhammad,"امام المتقین"));
        list.add(new M_NamesModel("Izzul Arab","The honour of Arabs.",R.drawable.muhammad,"عزالعرب"));
        list.add(new M_NamesModel("Jaami","Perfect.",R.drawable.muhammad,"جامع"));
        list.add(new M_NamesModel("Jabbar","Dominant.",R.drawable.muhammad,"جبار"));
        list.add(new M_NamesModel("Jawwad","The Generous",R.drawable.muhammad,"جواد"));
        list.add(new M_NamesModel("Kaaf","Sufficient, enough.",R.drawable.muhammad,"کاف"));
        list.add(new M_NamesModel("Kaamil","Perfect.",R.drawable.muhammad,"کامل"));

        super.onCreate(savedInstanceState);
    }
}