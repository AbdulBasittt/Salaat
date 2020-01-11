package com.example.salaat.ui.dua;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salaat.DuasAdapter;
import com.example.salaat.DuasModel;
import com.example.salaat.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class DuaFragment extends Fragment {
RecyclerView recyclerView;
List<DuasModel> list;
AdView adView;
    private SlideshowViewModel slideshowViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list=new ArrayList<>();
        list.add(new DuasModel("When In Anger",R.drawable.quran,"اَعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ","“I seek refuge in Al’laah from Shaitaan the cursed” ","[Tirmizi Shareef Vol.2 Pg.183]"));
        list.add(new DuasModel("Before And After Meal",R.drawable.quran,"اَ لْحَمْدُ للهِ الَّذِىْ اَطْعَمَنَا وَسَقَاناَ وَجَعَلَناَ مِنَ الْمُسْلِمِيْنَ","“All Praise is due to Al’laah, who has blessed us with food and drink and made us from amongst the Believers (Muslims)”","[Abu Dawood Pg.573]"));
        list.add(new DuasModel("Entering Masjid",R.drawable.quran,"اللّهُـمَّ افْتَـحْ لي أَبْوابَ رَحْمَتـِك","“O Allaah, open the doors of Your Mercy for me.”","[Sahi’h Muslim]"));
        list.add(new DuasModel("Exiting Masjid",R.drawable.quran,"اللّهُـمَّ إِنّـي أَسْأَلُكَ مِـنْ فَضْـلِك"," “O Allaah, I seek of You Your Grace.” ","[Sahi’h Muslim]"));
        list.add(new DuasModel("While Traveling:",R.drawable.quran,"سُبْحَنَ الَّذِىْ سَخَّرَلَنَا هَذَا وَ مَا كُنَّا لَهُ مُقْرِنِيْنْ وَ اِنَّا اِلَى رَبِّنَا لَمُنْقَلِبُوْنْ","Glory be to Al’laah who has given us control over this (mode of transport) and without his Grace we would not have been able to control it and undoubtedly we are to return towards our Lord.”","[Tirmizi, Abu Dawood]"));
        list.add(new DuasModel("After finishing a meal",R.drawable.quran,"الْحَمْدُ لِلَّهِ الَّذِى اطْعَمَنَا وَسَقَانَا ، وَجَعَلنَا مُسْلِمِينَ","Praise be to Allah Who has fed us and given us drink and made us Muslims.","Abu Dawud"));
        list.add(new DuasModel("After rainfall",R.drawable.quran,"مُطِرْنَا بِفَضْلِ اللهِ وَ رَحْمَتِهِ","We have been given rain by the grace and mercy of Allah.","Al-Bukhari 1:205, Muslim 1:83"));
        list.add(new DuasModel("Before sleeping",R.drawable.quran,"اللَّهُمَّ قِنِي عَذَابَكَ يَوْمَ تَبْعَثُ عِبَادَكَ.","O Allah, protect me from Your punishment on the day Your servants are resurrected.","Abu Dawud 4:311"));
        list.add(new DuasModel("For a healthy life",R.drawable.quran,"اللّهُـمَّ عافِـني في بَدَنـي ، اللّهُـمَّ عافِـني في سَمْـعي ، اللّهُـمَّ عافِـني في بَصَـري ، لا إلهَ إلاّ أَنْـتَ. اللّهُـمَّ إِنّـي أَعـوذُبِكَ مِنَ الْكُـفر ، وَالفَـقْر ، وَأَعـوذُبِكَ مِنْ عَذابِ القَـبْر ، لا إلهَ إلاّ أَنْـتَ","O Allah, make me healthy in my body. O Allah, preserve for me my hearing. O Allah, preserve for me my sight. There is none worthy of worship but You . O Allah , I seek refuge in You from disbelief and poverty and I seek refuge in You from the punishment of the grave . There is none worthy of worship but You.","Abu Dawud: 5090"));
        list.add(new DuasModel("For forgiveness",R.drawable.quran,"رَبِّ اغْفِرْ لِي رَبِّ اغْفِرْ لِي","Lord, forgive me. My Lord, forgive me.","An-Nasa'i: 1146, 1666 Abu Dawud: 874"));
        list.add(new DuasModel("For Justice",R.drawable.quran,"رَبَّنَا افْتَحْ بَيْنَنَا وَبَيْنَ قَوْمِنَا بِالْحَقِّ وَأَنتَ خَيْرُ الْفَاتِحِينَ","Our Lord! Decide Thou between us and our people in truth, for Thou art the best to decide.","Surah Al-A'raf - 7:89"));
        list.add(new DuasModel("For parents",R.drawable.quran,"رَبِّ اجْعَلْنِيْ مُقِيْمَ الصَّلٰوةِ وَمِنْ ذُرِّيَّتِيْ رَبَّنَا وَتَقَبَّلْ دُعَاۗءِ","O my Lord! Make me one who performs As-Salaat (Iqaamat-as-Salaat), and (also) from my offspring, our Lord! And accept my invocation.","Surah Ibraheem - 14:40"));
        list.add(new DuasModel("For Rizq (sustenance)",R.drawable.quran,"اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْماً نَافِعاً، وَرِزْقاً طَيِّباً، وَعَمَلاً مُتَقَبَّلاً","O Allah, I ask You for knowledge that is of benefit , a good provision , and deeds that will be accepted.","bn Majah: 925"));
        list.add(new DuasModel("For seeking Allah's help",R.drawable.quran,"حَسْبُـنا اللهُ وَنِعْـمَ الوَكـيل","Allah is sufficient for us and the best of those on whom to depend.","Surah Al-Imran 3:173"));

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)  {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dua, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        recyclerView=root.findViewById(R.id.dua_recycleer_view);
        MobileAds.initialize(getContext(),"ca-app-pub-3940256099942544~3347511713");
        adView=root.findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        DuasAdapter duasAdapter=new DuasAdapter(getContext(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(duasAdapter);
        duasAdapter.setOnItemClickListener(new DuasAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Toast.makeText(getContext(), "Item Clicked: " + position, Toast.LENGTH_SHORT).show();
            }
        });
        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}