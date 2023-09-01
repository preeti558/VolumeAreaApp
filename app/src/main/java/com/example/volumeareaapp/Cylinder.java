package com.example.volumeareaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity {
    EditText cylinder_radius, cylinder_height;
    TextView title, result;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinder_radius= findViewById(R.id.edittextCylinder);
        cylinder_height=findViewById(R.id.editTextcylinder);
        title = findViewById(R.id.cylindertextView2);
        result = findViewById(R.id.textView4);
        btn = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();

                int r = Integer.parseInt(radius);
                int h =Integer.parseInt(height);

                // V = pi*r^2*h

                double volume =  (3.14159 * (r * r )*h);
                result.setText("V = " + volume + " m^3");
            }
        });
    }


}
