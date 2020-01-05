package com.dhonig.echosystem;

import processing.core.PApplet;

public class Visualization extends PApplet
{
    public static void main(String[] args) {
        PApplet.main("com.dhonig.echosystem.Visualization");
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        fill(120,50,240);
    }

    @Override
    public void draw(){
        ellipse(width/2,height/2,second(),second());
    }

}
