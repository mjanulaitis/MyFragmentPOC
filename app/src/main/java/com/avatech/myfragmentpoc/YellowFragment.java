package com.avatech.myfragmentpoc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class YellowFragment extends Fragment implements View.OnClickListener {

    public YellowFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_yellow, container, false);

        Button b = (Button) v.findViewById(R.id.btnYellowBack);
        b.setOnClickListener(this);

        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnYellowBack: {
                FragmentManager fm = getFragmentManager();
                fm.popBackStack();
                break;
            }
        }
    }
}
