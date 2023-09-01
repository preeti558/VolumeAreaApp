package com.example.volumeareaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prism extends AppCompatActivity {
    EditText prism_length, prism_height, prism_width;
    TextView title, result;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prism_length= findViewById(R.id.editText2);
        prism_height=findViewById(R.id.editText4);
        prism_width=findViewById(R.id.editText5);
        title = findViewById(R.id.prismTitle);
        result = findViewById(R.id.textView6);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String length = prism_length.getText().toString();
                String height = prism_height.getText().toString();
                String width = prism_width.getText().toString();

                int l = Integer.parseInt(length);
                int h =Integer.parseInt(height);
                int w = Integer.parseInt(width);

                // V =l*w*h

                double volume =  l*h*w;
                result.setText("V = " + volume + " m^3");
            }
        });
    }

}
