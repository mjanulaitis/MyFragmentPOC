package com.avatech.myfragmentpoc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RedFragment extends Fragment implements View.OnClickListener {

    private MyObject myObject = new MyObject();
    private TextView txt;

    public RedFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_red, container, false);

        Button b = (Button) v.findViewById(R.id.btnIncrementMyObjectValue);
        b.setOnClickListener(this);

        b = (Button) v.findViewById(R.id.btnRedBack);
        b.setOnClickListener(this);

        b = (Button) v.findViewById(R.id.btnYellow);
        b.setOnClickListener(this);

        txt = (TextView)v.findViewById(R.id.txtMyObjectValue);
        txt.setText("" + myObject.Value);
        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIncrementMyObjectValue: {
                myObject.Value++;
                txt.setText("" + myObject.Value);
                break;
            }
            case R.id.btnRedBack: {
                FragmentManager fm = getFragmentManager();
                fm.popBackStack();
                break;
            }
            case R.id.btnYellow: {
                YellowFragment yellowFragment = new YellowFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(android.R.id.content, yellowFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
        }
    }
}
