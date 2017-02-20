/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e16;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int sum = scn.nextInt();
        int score[] = new int[sum];
        int total = 0;
        for (int i = 0; i < sum; i++) {
            score[i] = scn.nextInt();
            if (score[i] >= 0 && score[i] < 20) {
                System.out.println(score[i] + ":E");
            }
            if (score[i] >= 20 && score[i] < 40) {
                System.out.println(score[i] + ":D");
            }
            if (score[i] >= 40 && score[i] < 60) {
                System.out.println(score[i] + ":C");
            }
            if (score[i] >= 60 && score[i] < 80) {
                System.out.println(score[i] + ":B");
            }
            if (score[i] >= 80 && score[i] <= 100) {
                System.out.println(score[i] + ":A");
            }
            total += score[i];
        }
        System.out.println(total);
        System.out.println(total/sum);
    }

}
