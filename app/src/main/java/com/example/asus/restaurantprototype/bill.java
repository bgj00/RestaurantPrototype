package com.example.asus.restaurantprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
    }

    public void askbill(View view){
        Toast.makeText(getApplicationContext(), "Bill segera di antar", Toast.LENGTH_SHORT).show();
    }

}
