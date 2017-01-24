package app.eagle_eye.vocabularybuilderapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragment extends android.app.Fragment {
    ArcProgress arcProgress;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);
        arcProgress = (ArcProgress) rootView.findViewById(R.id.arc_progress);
        arcProgress.setProgress(0);
        return rootView;
    }

    public void changeProgress()
    {
        arcProgress.setProgress(arcProgress.getProgress()+2);
    }
}
