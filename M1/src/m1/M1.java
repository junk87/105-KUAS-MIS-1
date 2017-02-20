/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n < 100 && n > 1000) {
            n=scn.nextInt();
        }
        boolean no = true;
        for (int x = 5; x <= (n-38) / 5; x+=5) {
            for (int y = 3; y <= (n-45) / 6; y+=3) {
                for (int z = 2; z <= (n-43) / 10; z+=2) {
                    if (x * 5 + y * 6 + z * 10 == n) {
                        System.out.println("x=" + x + " y=" + y + " z=" + z);
                        no = false;
                    }
                }
            }
        }
        if(no){
            System.out.println("No Solution");
        }
    }
}


