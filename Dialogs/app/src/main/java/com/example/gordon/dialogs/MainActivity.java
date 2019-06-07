package com.example.gordon.dialogs;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  SetTime(String Time){
        Toast.makeText(getApplicationContext(),Time,Toast.LENGTH_LONG).show();

    }

    public void bushow(View view) {
        FragmentManager fm = getSupportFragmentManager();
        PopTime popTime = new PopTime();
        popTime.show(fm,"Show fragment");
    }
}
