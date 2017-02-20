/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e18;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String gen = scn.next();
        int height = scn.nextInt();
        if (gen.equals("boy")) {
            System.out.println((int)((height - 80) * 0.7));
        }
        if (gen.equals("girl")) {
            System.out.println((int)((height - 70) * 0.6));
        }

    }

}
