package com.example.asus.restaurantprototype;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class delivery extends AppCompatActivity {

    Dialog dia;
    Context context;
    TextView tv, mh1, id1;
    Button bt, bk, sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
    }

    public void getdialog(View view){
        dialog();
    }

    public void dialog(){

        /*Intent inpdata = getIntent();
        Bundle b = inpdata.getExtras();
        String[] id = b.getStringArray("Data");
        TextView */

        dia = new Dialog(delivery.this);
        dia.setContentView(R.layout.dialog);
        dia.setTitle("Quantity");
        dia.setCancelable(false);
        dia.show();

        context = this;

        Button btmbh = (Button) dia.findViewById(R.id.btntmbh);
        Button bkrg = (Button) dia.findViewById(R.id.btnkrg);
        Button bc = (Button) dia.findViewById(R.id.btnccl);
        sb = (Button) dia.findViewById(R.id.btnom);
        mh1 = (TextView) dia.findViewById(R.id.mh1);
        //id1 = (TextView) findViewById(R.id.id1);
        //mh1.setVisibility(View.INVISIBLE);

        btmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv = (TextView) dia.findViewById(R.id.tvqty);
                bt = (Button) dia.findViewById(R.id.btntmbh);
                bk = (Button) dia.findViewById(R.id.btnkrg);

                try{
                    String presentValStr = tv.getText().toString();
                    int presentIntVal = Integer.parseInt(presentValStr);
                    presentIntVal++;
                    tv.setText(String.valueOf(presentIntVal));
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(context,"Some Error ",Toast.LENGTH_LONG).show();
                }


            }
        });

        bkrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv = (TextView) dia.findViewById(R.id.tvqty);
                bt = (Button) dia.findViewById(R.id.btntmbh);
                bk = (Button) dia.findViewById(R.id.btnkrg);


                try{
                    String presentValStr = tv.getText().toString();
                    int presentIntVal = Integer.parseInt(presentValStr);
                    if(presentIntVal>0) {
                        presentIntVal--;
                    }else{
                        Toast.makeText(context, "Tidak bisa dikurangi lagi",Toast.LENGTH_LONG).show();
                    }
                    tv.setText(String.valueOf(presentIntVal));
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(context,"Some Error ",Toast.LENGTH_LONG).show();
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia.dismiss();
            }
        });





    }

}
