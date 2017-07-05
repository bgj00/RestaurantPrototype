package com.example.asus.restaurantprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
    }

    public void btnsubmit(View view){
        Toast.makeText(getApplicationContext(), "Data Member Telah Tersimpan", Toast.LENGTH_SHORT).show();
    }

    public void btncancel(View view){
        Intent intent = new Intent(member.this,menuUtama.class);
        startActivity(intent);
    }

}
