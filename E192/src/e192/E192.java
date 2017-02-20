/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e192;

/**
 *
 * @author user
 */
public class E192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 13; i += 2) {
            if (i <= 7) {
                for (int k = 5; k >= i; k -= 2) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 9; k <= i; k += 2) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 13 - i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
