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
public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5.0);
        System.out.println(square);
        square = new Square(6.3, "yelow", false);
        System.out.println(square);
    }
    
}
