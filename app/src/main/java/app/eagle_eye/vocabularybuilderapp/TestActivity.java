package app.eagle_eye.vocabularybuilderapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class TestActivity extends AppCompatActivity implements Communicator{

    Random random = new Random();
    String []wordlist;
    SimpleDictionary si;
    HashMap<String,Pair> map;
    InputStream is = null;
    BlankFragment bfragment;
    ViewPagerFragment viewPagerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        android.app.FragmentManager manager = getFragmentManager();
        bfragment = (BlankFragment) manager.findFragmentById(R.id.fragment);
        viewPagerFragment = (ViewPagerFragment) manager.findFragmentById(R.id.fragment2);
        try {
            is = getAssets().open("words.txt");
            si = new SimpleDictionary(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        wordlist = si.getWordList();
        map = si.getDatabase();
        wordChange();
    }

    public void wordChange()
    {
        int indRand = random.nextInt(si.getSize());
        //tv.setText(wordlist[indRand]+" "+map.get(wordlist[indRand]).meaning);
        //if(map.get())
        bfragment.changeData(wordlist[indRand],map.get(wordlist[indRand]).meaning);
    }
    @Override
    public void respond1() {
        viewPagerFragment.changeProgress();
        wordChange();
    }
    @Override
    public void respond2() {
        wordChange();
    }
}
