/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e17;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        boolean b = true;
        while (b) {
            int sum = scn.nextInt();
            if (sum == 0) {
                break;
            }
            int number[] = new int[sum];
            int dist[] = new int[sum - 1];
            int smest = 1000;
            int j = 0;
            for (int i = 0; i < sum; i++) {
                number[i] = scn.nextInt();
                if (i >= 1) {
                    int a = Math.abs(number[i] - number[i - 1]);
                    if (smest > a) {
                        smest = dist[j];
                    }
                }
            }
            System.out.println(smest);
            smest = 1000;
        }
    }
}
