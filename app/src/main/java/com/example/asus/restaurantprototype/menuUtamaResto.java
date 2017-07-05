package com.example.asus.restaurantprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuUtamaResto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama_resto);
    }

    public void order(View view){
        Intent intent = new Intent(menuUtamaResto.this, order.class);
        startActivity(intent);
    }

    public void bill(View view){
        Intent intent = new Intent(menuUtamaResto.this, bill.class);
        startActivity(intent);
    }

    public void menu(View view){
        Intent intent = new Intent(menuUtamaResto.this,delivery.class);
        startActivity(intent);
    }

}
