package com.example.asus.restaurantprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }

    public void btnsubmit(View view){
        Toast.makeText(getApplicationContext(), "Data Booking Telah Tersimpan", Toast.LENGTH_SHORT).show();
    }

    public void btncancel(View view){
        Intent intent = new Intent(booking.this,menuUtama.class);
        startActivity(intent);
    }

}
