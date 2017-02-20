/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m9;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class M9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int money = scn.nextInt();
        float costoff = 0;
        if (money < 3000) {
            costoff = money * 0.9f;
            System.out.println((Math.round(costoff)));
        }
        if (money >= 3000 && money < 4000) {
            costoff = money * 0.85f;
            System.out.println((Math.round(costoff)));
        }
        if (money >= 4000 && money < 6000) {
            costoff = money * 0.8f;
            System.out.println((Math.round(costoff)));
        }
        if (money > 6000) {
            costoff = money * 0.7f;
            System.out.println((Math.round(costoff)));
        }
    }

}
