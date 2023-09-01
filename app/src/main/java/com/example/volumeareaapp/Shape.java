package com.example.volumeareaapp;

public class Shape {
    int shapeImg;
    String shapeName;

    public Shape(int shapeImg, String shapeName) {
        this.shapeImg = shapeImg;
        this.shapeName=shapeName;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
