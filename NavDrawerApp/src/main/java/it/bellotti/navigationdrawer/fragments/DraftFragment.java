package it.bellotti.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.bellotti.navigationdrawer.R;

/**
 * Created by Simone_Bellotti on 13/04/2014.
 */
public class DraftFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_draft, container, false);
    }
}
