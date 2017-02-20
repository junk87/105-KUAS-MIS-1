/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int start[] = new int[2];
        for (int i = 0; i < 2; i++) {
            start[i] = scn.nextInt();
        }
        int end[] = new int[2];
        for (int i = 0; i < 2; i++) {
            end[i] = scn.nextInt();
        }
        int hrmoney = 0;
        int minmoney = 0;
        int i = 1;
        int j = end[0] - start[0];
        if (end[1] - start[1] < -30) {
            j--;
        }
        if (j==0 && (end[1] - start[1] < 30 || end[1] - start[1] < -30)) {
            System.out.println("免費");
        }
        if (end[1] - start[1] >= 30 || end[1] - start[1] >= -30) {
            if (j < 2) {
                minmoney += 30;
            }
            if (j >= 2 && j < 4) {
                minmoney += 40;
            }
            if (j >= 4) {
                minmoney += 60;
            }
        }
        if (j!= 0) {

            for (i = 1; i <= j; i++) {
                if (i <= 2) {
                    hrmoney += 60;
                }
                if (i > 2 && i <= 4) {
                    hrmoney += 80;
                }
                if (i > 4) {
                    hrmoney += 120;
                }
            }
        }
        System.out.println(hrmoney + minmoney + "元");
    }

}
