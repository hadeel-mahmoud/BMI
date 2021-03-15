package edu.cs.birzeit.showmynameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Float h = Float.parseFloat(findViewById(R.id.height).toString()) /100;
                Float w = Float.parseFloat(findViewById(R.id.weight).toString());
                Float res = w/(h*h);
                TextView t=(TextView) findViewById(R.id.result);
                t.setText(res.toString());
                // Code here executes on main thread after user presses button
            }
        });
    }



}