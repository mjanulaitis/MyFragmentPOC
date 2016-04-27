package com.avatech.myfragmentpoc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlueFragment extends Fragment implements View.OnClickListener {

    public BlueFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blue, container, false);
        Button b = (Button) v.findViewById(R.id.btnRed);
        b.setOnClickListener(this);
        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRed:
                RedFragment redFragment = new RedFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(android.R.id.content, redFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
        }
    }

}
