package com.example.gordon.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText etn1;
    EditText etn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult=(TextView)findViewById(R.id.tvresult);
        etn1=(EditText)findViewById(R.id.etn1);
        etn2=(EditText)findViewById(R.id.etn2);

    }

    public void buClick(View view) {
        double n1 = Double.parseDouble(etn1.getText().toString());
        double n2 = Double.parseDouble(etn2.getText().toString());
        double r = n1+n2;
        tvResult.setText("sum"+r);
    }

}
