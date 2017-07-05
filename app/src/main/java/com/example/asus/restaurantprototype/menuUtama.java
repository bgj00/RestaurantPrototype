package com.example.asus.restaurantprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    public void delivery(View view){
        Intent intent = new Intent(menuUtama.this,delivery.class);
        startActivity(intent);
    }

    public void availablemenu(View view){
        Intent intent = new Intent(menuUtama.this, availablemenu.class);
        startActivity(intent);
    }

    public void booking(View view){
        Intent intent = new Intent(menuUtama.this, booking.class);
        startActivity(intent);
    }

    public void bill(View view){
        Intent intent = new Intent(menuUtama.this, bill.class);
        startActivity(intent);
    }

    public void member(View view){
        Intent intent = new Intent(menuUtama.this, member.class);
        startActivity(intent);
    }

    public void order(View view){
        Intent intent = new Intent(menuUtama.this, order.class);
        startActivity(intent);
    }

}
