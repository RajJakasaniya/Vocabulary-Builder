package app.eagle_eye.vocabularybuilderapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends android.app.Fragment {
    Communicator communicator;
    TextView text1,text2,currentMeaning,currentWord;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        text1 = (TextView) view.findViewById(R.id.doKnow);
        text2 = (TextView) view.findViewById(R.id.dontKnow);
        currentMeaning = (TextView) view.findViewById(R.id.meaning);
        currentWord = (TextView) view.findViewById(R.id.wordName);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                communicator.respond1();
            }
        });
    }

    public void changeData(String word,String meaning)
    {
        currentWord.setText(word);
        currentMeaning.setText(meaning);
    }
    public void setMasteredClick(View v)
    {
    }

}
