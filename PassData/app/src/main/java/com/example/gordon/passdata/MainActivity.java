package com.example.gordon.passdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUserName;
    EditText etPasswords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPasswords = (EditText)findViewById(R.id.etPasswords);
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();

    }
    String userName="Gordon";
    String Passwords="0000";
    String Neme="Gordon Yan";

    public void buLogin(View view) {
        if(userName.equals(etUserName.getText().toString())&&Passwords.equals(etPasswords.getText().toString()))
        {
            // go to second activity
            Intent intent = new Intent( this,Home.class);
            intent.putExtra("key","123");
            intent.putExtra("name",Neme);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

}
