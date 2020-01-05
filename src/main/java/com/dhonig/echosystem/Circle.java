package com.dhonig;

import processing.core.PApplet;
import processing.core.PVector;

public class Circle {
    private PVector location;
    private PVector velocity;

    private PApplet sketch;

    public Circle(PApplet sketch) {
        this.sketch = sketch;
        this.location=new PVector(sketch.width/2, sketch.height/2);
        this.velocity= new PVector(2.5f, -2);

    }

    public void draw(){
        sketch.background(255);
        this.move();
        this.bounce();
        System.out.println("Location X:"+location.x+ " Location Y"+location.y);
        this.display();

    }

    void move(){
      location.add(velocity);
    }





    void bounce(){

         if((location.x > sketch.width) || (location.x <0)){
             velocity.x=velocity.x * -1;
        }

        if((location.y > sketch.height) || (location.y <0)) {
           velocity.y=velocity.y * -1;
        }
    }


    void display(){
        sketch.stroke(0);
        sketch.strokeWeight(2);
        sketch.fill(127);
        sketch.ellipse(location.x, location.y, 48,48);
    }
}