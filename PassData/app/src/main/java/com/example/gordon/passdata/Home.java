package com.example.gordon.passdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    EditText etShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Read from intent
        Bundle b=getIntent().getExtras();
        if(!b.getString("key").equals("123"))
            finish();
        String name = b.getString("name");
        String userName = b.getString("userName");
        etShow=(EditText)findViewById(R.id.etShow);
        etShow.setText(name);


    }

    public void buClose(View view) {
        finish();
    }
}
