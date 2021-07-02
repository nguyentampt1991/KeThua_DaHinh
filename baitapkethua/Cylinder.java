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
public class Cylinder extends Circle{
    private double height ;
    public Cylinder(){
        
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getRadius()*super.getRadius()*Math.PI*height;
    }
    
    @Override
    public String toString(){
        return "Cylinder with height = "+ getHeight() + ", which is a subclass :" + super.toString();
    }
}
