package com.dhonig.echosystem;

import com.dhonig.Circle;
import processing.core.PApplet;

public class Visualization extends PApplet {

    static int WIDTH=1024;
    static int HEIGHT=768;


    Circle c;


    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        this.fill(120,50,240);
         c= new Circle(this);
    }

    @Override
    public void draw(){
        c.draw();
    }

    public static void main(String[] args) {
        PApplet.main("com.dhonig.echosystem.Visualization");
    }
}
