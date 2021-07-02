/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

/**
 *
 * @author Tam Nguyen
 */
public class Circle {
    private double radius ;
    private  String color ="";
    public Circle()
    {
        
    }
    public Circle(double radius, String color)
    {
        this.radius= radius;
        this.color= color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return " Circle with radius = "+ getRadius() + " and color : " +getColor()  ;
    }
    
    
}
