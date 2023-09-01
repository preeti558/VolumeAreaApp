package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1- AdapterView: GridView
    GridView gridView;

    // 2- Data Source: ArrayList<Shape>
    ArrayList<Shape> shapeArrayList;

    // 3- Adapter: MyCustomAdapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere, "Sphere");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.cube, "Cube");
        Shape s4 = new Shape(R.drawable.rectangular_prism, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);


        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Determine which item was clicked based on its position
                Intent i = null;
                switch (position) {
                    case 0: // First column, first item (Sphere)
                        i = new Intent(getApplicationContext(), Sphere.class);
                        break;
                    case 1: // First column, second item (Cube)
                        i = new Intent(getApplicationContext(), Cube.class);
                        break;
                    case 2: // Second column, first item (Cylinder)
                        i = new Intent(getApplicationContext(), Cylinder.class);
                        break;
                    case 3: // Second column, second item (Prism)
                        i = new Intent(getApplicationContext(), Prism.class);
                        break;
                    default:
                        // Handle any other cases or errors here
                        break;
                }

                // Start the activity if an intent is available
                if (i != null) {
                    startActivity(i);
                }
            }
        });

    }
}
