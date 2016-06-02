package org.secuso.privacyfriendlyruler;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by roberts on 02.06.16.
 */
public class RulerFragment extends Fragment {

    Activity activity;
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_ruler, container, false);
        container.removeAllViews();

        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        double xdpi = dm.xdpi;
        double xdpmm = xdpi * 25.4;
        double height = (dm.heightPixels)/xdpmm; //height in mm

        RulerView rv = new RulerView(activity.getBaseContext());
        LinearLayout ll = (LinearLayout) rootView.findViewById(R.id.fragment_ruler);
        ll.addView(rv);

        return rootView;
    }


    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

}