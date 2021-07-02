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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        
        rectangle = new Rectangle(4, 4);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        rectangle = new Rectangle(5, 5, "black", false);
        System.out.println(rectangle);
        
    }
    
}
