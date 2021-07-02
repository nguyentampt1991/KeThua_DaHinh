/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethuavadahinh;

/**
 *
 * @author Tam Nguyen
 */
public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius= radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius= radius;
    }
    // add getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //
    public double getArea(){
        return radius*radius * Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Cirle with radius = "+getRadius() +" , which is a subclass of " + super.toString();
    }
    
  
}
