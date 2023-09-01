package com.example.volumeareaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity {
    EditText cube_edge;
    TextView title, result;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cube_edge = findViewById(R.id.editText);
        title = findViewById(R.id.cubeTextview);
        result = findViewById(R.id.textView5);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edge = cube_edge.getText().toString();

                int a = Integer.parseInt(edge);

                // V = a*a*a

                double volume = (a*a*a);
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}
