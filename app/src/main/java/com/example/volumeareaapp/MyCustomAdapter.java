package com.example.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
      super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList=shapesArrayList;
        this.context = context;
    }
    //create view Holder class for cache references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }
   // GetView(): used to create and return a view for a specific item in grid
   @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        MyViewHolder myViewHolder;

if(convertView==null){
    myViewHolder=new MyViewHolder();
    LayoutInflater inflater=LayoutInflater.from(getContext());

    convertView=inflater.inflate(
            R.layout.grid_item_layout,
            parent,
            false
    );
    myViewHolder.shapeName=(TextView) convertView.findViewById(R.id.textView);
    myViewHolder.shapeImg=(ImageView) convertView.findViewById(R.id.imageView);
    convertView.setTag(myViewHolder);
}else{
    myViewHolder=(MyViewHolder) convertView.getTag();

}
Shape shape=getItem(position);
if(shape!=null){
myViewHolder.shapeName.setText(shape.getShapeName());
myViewHolder.shapeImg.setImageResource(shape.getShapeImg());
}

return convertView;
   }


}
