package com.example.asus.restaurantprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usrnm, pass;
    String user, pss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrnm = (EditText) findViewById(R.id.etuname);
        pass = (EditText) findViewById(R.id.etpass);

    }

    public void login(View view){

        user = usrnm.getText().toString();
        pss = pass.getText().toString();
        if(user.equals("6314205") && pss.equals("6314134")){
            Intent intent = new Intent(MainActivity.this, menuUtama.class);
            startActivity(intent);
        }else if(user.equals("restaurant") && pss.equals("restaurant")){
            Intent intent = new Intent(MainActivity.this, menuUtamaResto.class);
            startActivity(intent);
        } else{
            Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_LONG).show();
        }

    }

}
