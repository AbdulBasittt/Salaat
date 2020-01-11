package com.example.salaat.ui.namesofALLAH;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salaat.NameAdapter;
import com.example.salaat.NamesModel;
import com.example.salaat.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NamesFragment extends Fragment {
    ImageView Play,Pause,Stop;
    SeekBar seekBar;
    MediaPlayer mediaPlayer;
    FloatingActionButton fab;
    private RecyclerView myrecyclerView;
    private List<NamesModel> listContact;
    private ToolsViewModel toolsViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        listContact=new ArrayList<>();
        listContact.add(new NamesModel("AR-RAHMAAN","The Most or Entirely Merciful",R.drawable.namesss,"الرَّحْمَنُ"));
        listContact.add(new NamesModel("AR-RAHEEM","The Bestower of Mercy",R.drawable.namesss,"الرَّحِيمُ"));
        listContact.add(new NamesModel("AL-MALIK","The King and Owner of Dominion",R.drawable.namesss,"الْمَلِكُ"));
        listContact.add(new NamesModel("AL-QUDDUS","The Absolutely Pure",R.drawable.namesss,"الْقُدُّوسُ"));
        listContact.add(new NamesModel("AS-SALAM","The Perfection and Giver of Peace",R.drawable.namesss,"السَّلاَمُ"));
        listContact.add(new NamesModel("AL-MU’MIN","The One Who gives Emaan and Security",R.drawable.namesss,"الْمُؤْمِنُ"));
        listContact.add(new NamesModel("AL-MUHAYMIN","The Guardian, The Witness, The Overseer",R.drawable.namesss,"الْمُهَيْمِنُ"));
        listContact.add(new NamesModel("AL-AZEEZ","The All Mighty",R.drawable.namesss,"الْعَزِيزُ"));
        listContact.add(new NamesModel("AL-JABBAR","The Compeller, The Restorer",R.drawable.namesss,"الْجَبَّارُ"));
        listContact.add(new NamesModel("AL-MUTAKABBIR","The Supreme, The Majestic",R.drawable.namesss,"الْمُتَكَبِّرُ"));
        listContact.add(new NamesModel("AL-KHAALIQ","The Creator, The Maker",R.drawable.namesss,"الْخَالِقُ"));
        listContact.add(new NamesModel("AL-BAARI’","The Originator",R.drawable.namesss,"الْبَارِئُ"));
        listContact.add(new NamesModel("AL-MUSAWWIR","The Fashioner",R.drawable.namesss,"الْمُصَوِّرُ"));
        listContact.add(new NamesModel("AL-GHAFFAR","The All- and Oft-Forgiving",R.drawable.namesss,"الْغَفَّارُ"));
        listContact.add(new NamesModel("AL-QAHHAR","The Subduer, The Ever-Dominating",R.drawable.namesss,"الْقَهَّارُ"));
        listContact.add(new NamesModel("AL-WAHHAAB","The Giver of Gifts",R.drawable.namesss,"الْوَهَّابُ"));
        listContact.add(new NamesModel("AR-RAZZAAQ","The Provider",R.drawable.namesss,"الرَّزَّاقُ"));
        listContact.add(new NamesModel("AL-FATTAAH","The Opener, The Judge",R.drawable.namesss,"الْفَتَّاحُ"));
        listContact.add(new NamesModel("AL-‘ALEEM","The All-Knowing, The Omniscient",R.drawable.namesss,"اَلْعَلِيْمُ"));
        listContact.add(new NamesModel("AL-QAABID","The Withholder",R.drawable.namesss,"الْقَابِضُ"));
        listContact.add(new NamesModel("AL-BAASIT","The Extender",R.drawable.namesss,"الْبَاسِطُ"));
        listContact.add(new NamesModel("AL-KHAAFIDH","The Reducer, The Abaser",R.drawable.namesss,"الْخَافِضُ"));
        listContact.add(new NamesModel("AR-RAAFI’","The Exalter, The Elevator",R.drawable.namesss,"الرَّافِعُ"));
        listContact.add(new NamesModel("AL-MU’IZZ","The Honourer, The Bestower",R.drawable.namesss,"الْمُعِزُّ"));
        listContact.add(new NamesModel("AL-MUZIL","The Dishonourer, The Humiliator",R.drawable.namesss,"المُذِلُّ"));
        listContact.add(new NamesModel("AS-SAMEE’","The All-Hearing",R.drawable.namesss,"السَّمِيعُ"));
        listContact.add(new NamesModel("AL-BASEER","The All-Seeing",R.drawable.namesss,"الْبَصِيرُ"));
        listContact.add(new NamesModel("AL-HAKAM","The Judge, The Giver of Justice",R.drawable.namesss,"الْحَكَمُ"));
        listContact.add(new NamesModel("AL-‘ADL","The Utterly Just",R.drawable.namesss,"الْعَدْلُ"));
        listContact.add(new NamesModel("AL-LATEEF","The Subtle One, The Most Gentle",R.drawable.namesss,"اللَّطِيفُ"));
        listContact.add(new NamesModel("AL-KHABEER","The Acquainted, the All-Aware",R.drawable.namesss,"الْخَبِيرُ"));
        listContact.add(new NamesModel("AL-HALEEM","The Most Forbearing",R.drawable.namesss,"الْحَلِيمُ"));
        listContact.add(new NamesModel("AL-‘ATHEEM","The Magnificent, The Supreme",R.drawable.namesss,"الْعَظِيمُ"));
        listContact.add(new NamesModel("AL-GHAFOOR","The Forgiving, The Exceedingly Forgiving",R.drawable.namesss,"الْغَفُورُ"));
        listContact.add(new NamesModel("ASH-SHAKOOR","The Most Appreciative",R.drawable.namesss,"الشَّكُورُ"));
        listContact.add(new NamesModel("AL-‘ALEE","The Most High, The Exalted",R.drawable.namesss,"الْعَلِيُّ"));
        listContact.add(new NamesModel("AL-KABEER","The Greatest, The Most Grand",R.drawable.namesss,"الْكَبِيرُ"));
        listContact.add(new NamesModel("AL-HAFEEDH","The Preserver, The All-Heedful and All-Protecting",R.drawable.namesss,"الْحَفِيظُ"));
        listContact.add(new NamesModel("AL-MUQEET","The Sustainer",R.drawable.namesss,"المُقيِت"));
        listContact.add(new NamesModel("AL-HASEEB","The Reckoner, The Sufficient",R.drawable.namesss,"الْحسِيبُ"));
        listContact.add(new NamesModel("AL-JALEEL","The Majestic",R.drawable.namesss,"الْجَلِيلُ"));
        listContact.add(new NamesModel("AL-KAREEM","The Most Generous, The Most Esteemed",R.drawable.namesss,"الْكَرِيمُ"));
        listContact.add(new NamesModel("AR-RAQEEB","The Watchful",R.drawable.namesss,"الرَّقِيبُ "));
        listContact.add(new NamesModel("AL-MUJEEB","The Responsive One",R.drawable.namesss,"الْمُجِيبُ"));
        listContact.add(new NamesModel("AL-WAASI’","The All-Encompassing, the Boundless",R.drawable.namesss,"الْوَاسِعُ"));
        listContact.add(new NamesModel("AL-HAKEEM","The All-Wise",R.drawable.namesss,"الْحَكِيمُ"));
        listContact.add(new NamesModel("AL-WADOOD","The Most Loving",R.drawable.namesss,"الْوَدُودُ"));
        listContact.add(new NamesModel("AL-MAJEED","The Glorious, The Most Honorable",R.drawable.namesss,"الْمَجِيدُ"));
        listContact.add(new NamesModel("AL-BA’ITH","The Resurrector, The Raiser of the Dead",R.drawable.namesss,"الْبَاعِثُ"));
        listContact.add(new NamesModel("ASH-SHAHEED","The All- and Ever Witnessing",R.drawable.namesss,"الشَّهِيدُ"));
        listContact.add(new NamesModel("AL-HAQQ","The Absolute Truth",R.drawable.namesss,"الْحَقُّ "));
        listContact.add(new NamesModel("AL-WAKEEL","The Trustee, The Disposer of Affairs",R.drawable.namesss,"الْوَكِيلُ"));
        listContact.add(new NamesModel("AL-QAWIYY ","The All-Strong",R.drawable.namesss,"الْقَوِيُّ"));
        listContact.add(new NamesModel("AL-MATEEN","The Firm, The Steadfast",R.drawable.namesss,"الْمَتِينُ"));
        listContact.add(new NamesModel("AL-WALIYY","The Protecting Associate",R.drawable.namesss,"الْوَلِيُّ"));
        listContact.add(new NamesModel("AL-HAMEED","The Praiseworthy",R.drawable.namesss,"الْحَمِيدُ"));
        listContact.add(new NamesModel("AL-MUHSEE","The All-Enumerating, The Counter",R.drawable.namesss,"الْمُحْصِي"));
        listContact.add(new NamesModel("AL-MUBDI","The Originator, The Initiator",R.drawable.namesss,"الْمُبْدِئُ"));
        listContact.add(new NamesModel("AL-MU’ID","The Restorer, The Reinstater",R.drawable.namesss,"الْمُعِيدُ"));
        listContact.add(new NamesModel("AL-MUHYEE","The Giver of Life",R.drawable.namesss,"الْمُحْيِي"));
        listContact.add(new NamesModel("AL-MUMEET","The Bringer of Death, the Destroyer",R.drawable.namesss,"اَلْمُمِيتُ"));
        listContact.add(new NamesModel("AL-HAYY","The Ever-Living",R.drawable.namesss,"الْحَيُّ"));
        listContact.add(new NamesModel("AL-QAYYOOM","The Sustainer, The Self-Subsisting",R.drawable.namesss,"الْقَيُّومُ"));
        listContact.add(new NamesModel("AL-WAAJID","The Perceiver",R.drawable.namesss,"الْوَاجِدُ"));
        listContact.add(new NamesModel("AL-MAAJID","The Illustrious, the Magnificent",R.drawable.namesss,"الْمَاجِدُ"));
        listContact.add(new NamesModel("AL-WAAHID","The One",R.drawable.namesss,"الْواحِدُ"));
        listContact.add(new NamesModel("AL-AHAD","The Unique, The Only One",R.drawable.namesss,"اَلاَحَدُ"));
        listContact.add(new NamesModel("AS-SAMAD","The Eternal, Satisfier of Needs",R.drawable.namesss,"الصَّمَدُ"));
        listContact.add(new NamesModel("AL-QADEER","The Capable, The Powerful",R.drawable.namesss,"الْقَادِرُ"));
        listContact.add(new NamesModel("AL-MUQTADIR","The Omnipotent",R.drawable.namesss,"الْمُقْتَدِرُ"));
        listContact.add(new NamesModel("AL-MUQADDIM","The Expediter, The Promoter",R.drawable.namesss,"الْمُقَدِّمُ"));
        listContact.add(new NamesModel("AL-MU’AKHKHIR","The Delayer, the Retarder",R.drawable.namesss,"الْمُؤَخِّرُ"));
        listContact.add(new NamesModel("AL-AWWAL","The First",R.drawable.namesss,"الأوَّلُ"));
        listContact.add(new NamesModel("AL-AAKHIR","The Last",R.drawable.namesss,"الآخِرُ"));
        listContact.add(new NamesModel("AZ-DHAAHIR","The Manifest",R.drawable.namesss,"الظَّاهِرُ"));
        listContact.add(new NamesModel("AL-BAATIN","The Hidden One, Knower of the Hidden",R.drawable.namesss,"الْبَاطِنُ"));
        listContact.add(new NamesModel("AL-WAALI","The Governor, The Patron",R.drawable.namesss,"الْوَالِي"));
        listContact.add(new NamesModel("AL-MUTA’ALI","The Self Exalted",R.drawable.namesss,"الْمُتَعَالِي"));
        listContact.add(new NamesModel("AL-BARR","The Source of Goodness, the Kind Benefactor",R.drawable.namesss,"الْبَرُّ"));
        listContact.add(new NamesModel("AT-TAWWAB","The Ever-Pardoning, The Relenting",R.drawable.namesss,"التَّوَابُ"));
        listContact.add(new NamesModel("AL-MUNTAQIM","The Avenger",R.drawable.namesss,"الْمُنْتَقِمُ"));
        listContact.add(new NamesModel("AL-‘AFUWW","The Pardoner",R.drawable.namesss,"العَفُوُّ"));
        listContact.add(new NamesModel("AR-RA’OOF","The Most Kind",R.drawable.namesss,"الرَّؤُوفُ"));
        listContact.add(new NamesModel("MAALIK-UL-MULK","Master of the Kingdom",R.drawable.namesss,"مَالِكُ الْمُلْكِ"));
        listContact.add(new NamesModel("DHUL-JALAALI WAL-IKRAAM","Possessor of Glory and Honour",R.drawable.namesss,"ذُوالْجَلاَلِ وَالإكْرَامِ"));
        listContact.add(new NamesModel("AL-MUQSIT","The Equitable, the Requiter",R.drawable.namesss,"الْمُقْسِطُ"));
        listContact.add(new NamesModel("AL-JAAMI’","The Gatherer, the Uniter",R.drawable.namesss,"الْجَامِعُ"));
        listContact.add(new NamesModel("AL-GHANIYY","The Self-Sufficient, The Wealthy",R.drawable.namesss,"الْغَنِيُّ"));
        listContact.add(new NamesModel("AL-MUGHNI","The Enricher",R.drawable.namesss,"الْمُغْنِي"));
        listContact.add(new NamesModel("AL-MANI’","The Withholder",R.drawable.namesss,"اَلْمَانِعُ"));
        listContact.add(new NamesModel("AD-DHARR","The Distresser",R.drawable.namesss,"الضَّارَّ"));
        listContact.add(new NamesModel("AN-NAFI’","The Propitious",R.drawable.namesss,"النَّافِعُ"));
        listContact.add(new NamesModel("AN-NUR","The Light, The Illuminator",R.drawable.namesss,"النُّورُ"));
        listContact.add(new NamesModel("AL-HAADI","The Guide",R.drawable.namesss,"الْهَادِي"));
        listContact.add(new NamesModel("AL-BADEE","The Incomparable Originator",R.drawable.namesss,"الْبَدِيعُ"));
        listContact.add(new NamesModel("AL-BAAQI","The Ever-Surviving, The Everlasting",R.drawable.namesss,"اَلْبَاقِي"));
        listContact.add(new NamesModel("AL-WAARITH","The Inheritor, The Heir",R.drawable.namesss,"الْوَارِثُ"));
        listContact.add(new NamesModel("AR-RASHEED","The Guide, Infallible Teacher",R.drawable.namesss,"الرَّشِيدُ"));
        listContact.add(new NamesModel("AS-SABOOR","The Forbearing, The Patient",R.drawable.namesss,"الصَّبُورُ"));
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)  {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_names, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);


             Play=(ImageView)root.findViewById(R.id.play);
             Pause=(ImageView)root.findViewById(R.id.pause_btn);
             Stop=root.findViewById(R.id.stop_btn);
             Stop.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Stopp();
                 }
             });
            //final MediaPlayer mediaPlayer=MediaPlayer.create(getContext(),R.raw.namesof);
            Play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer==null){
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.namesof);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                stopPlayer();
                            }
                        });
                    }
                    mediaPlayer.start();
                    Toast.makeText(getContext(), "Play..!", Toast.LENGTH_SHORT).show();

                }
            });
            Pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer!=null){
                        mediaPlayer.pause();
                        Toast.makeText(getContext(), "Pause..!", Toast.LENGTH_SHORT).show();
                    }
                   // mediaPlayer.stop();

                }
            });


        myrecyclerView=root.findViewById(R.id.recycler_view);
        NameAdapter recyclerViewAdapter = new NameAdapter(getContext(),listContact);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);
        return root;
    }

    private void Stopp() {
        stopPlayer();
    }

    private void stopPlayer(){
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
            Toast.makeText(getContext(), "Player released", Toast.LENGTH_SHORT).show();
        }
     }
}