package com.example.gordon.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

public class PopTime extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker tp;
    Button buDome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view=inflater.inflate(R.layout.pop_time,container,false);
        tp=(TimePicker) view.findViewById(R.id.tp1);
        buDome=(Button) view.findViewById(R.id.buDome);
        buDome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        this.dismiss();
        String timeOn=tp.getHour()+":"+tp.getMinute();
        MainActivity ma=(MainActivity)getActivity();
        ma.SetTime(timeOn);
    }
}
