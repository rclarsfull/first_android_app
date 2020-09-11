package com.example.ichliebedich;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus,minus,mal,geteilt;

        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mal=findViewById(R.id.mal);
        geteilt=findViewById(R.id.geteilt);

    }
}