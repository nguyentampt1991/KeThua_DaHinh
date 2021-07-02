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
public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape= new Shape("red", false);
        System.out.println(shape);
    }
    
}
