package com.example.ichliebedich;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus,minus,mal,geteilt;
        final EditText nummer1,nummer2;
        final TextView loesung;
        final ImageView bild;

        double z1,z2;

        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mal=findViewById(R.id.mal);
        geteilt=findViewById(R.id.geteilt);

        nummer1=findViewById(R.id.nummer1);
        nummer2=findViewById(R.id.nummer2);

        loesung=findViewById(R.id.loesung);

        bild=findViewById(R.id.love);

        bild.setVisibility(View.GONE);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.println("Test");
                    double z1,z2;
                try {
                    z1 = Double.parseDouble(nummer1.getText().toString());
                    //System.out.println(z1);
                } catch (Exception e){
                    z1=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                try {
                    z2 = Double.parseDouble(nummer2.getText().toString());
                    //System.out.println(z2);
                } catch (Exception e){
                    z2=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }



            if ((((int)z1)==5062020)||(((int)z2)==5062020)) {
                bild.setVisibility(View.VISIBLE);
                //System.out.println("true");
            }else{
                bild.setVisibility(View.GONE);
                //System.out.println("false");
            }


            double l=z1+z2;
            loesung.setText(String.valueOf(l));



            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bild.setVisibility(View.GONE);

                double z1,z2;
                try {
                    z1 = Double.parseDouble(nummer1.getText().toString());
                    //System.out.println(z1);
                } catch (Exception e){
                    z1=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                try {
                    z2 = Double.parseDouble(nummer2.getText().toString());
                    //System.out.println(z2);
                } catch (Exception e){
                    z2=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                double l=z1-z2;
                loesung.setText(String.valueOf(l));

            }
        });
        mal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bild.setVisibility(View.GONE);


                double z1,z2;
                try {
                    z1 = Double.parseDouble(nummer1.getText().toString());
                    //System.out.println(z1);
                } catch (Exception e){
                    z1=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                try {
                    z2 = Double.parseDouble(nummer2.getText().toString());
                    //System.out.println(z2);
                } catch (Exception e){
                    z2=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                double l=z1*z2;
                loesung.setText(String.valueOf(l));

            }
        });
        geteilt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bild.setVisibility(View.GONE);

                double z1,z2;
                try {
                    z1 = Double.parseDouble(nummer1.getText().toString());
                    //System.out.println(z1);
                } catch (Exception e){
                    z1=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                try {
                    z2 = Double.parseDouble(nummer2.getText().toString());
                    //System.out.println(z2);
                } catch (Exception e){
                    z2=0;
                    loesung.setText("ERROR 404");
                    System.out.println("Fehler");
                }

                double l=z1/z2;
                loesung.setText(String.valueOf(l));

            }
        });

    }
}