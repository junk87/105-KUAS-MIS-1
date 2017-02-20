/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a;
        if (a % 2 != 0) {
            int c[][] = new int[a][b];
            int sum = 0;
            int indexa = a / 2;
            int indexb = b / 2;
            int rank[] = new int[a * b];
            int rindex = 0;
            while (true) {
                sum++;
                if (c[indexa][indexb] <= 0) {
                    c[indexa][indexb]++;
                    rank[rindex] = (indexa * a) + indexb + 1;
                    rindex++;
                }
                int randoma = (int) (Math.random() * a);
                int randomb = (int) (Math.random() * b);
                if (indexa == randoma && indexb == randomb) {
                    continue;
                }
                if (indexa + 1 < randoma || indexb + 1 < randomb) {
                    continue;
                }
                indexa = randoma;
                indexb = randomb;
                System.out.print((indexa * a) + indexb + 1 + "-");
                if (rindex == (a * b) ) {
                    System.out.println();
                    break;
                }
            }
            System.out.println(sum);
            for (int i = 0; i < a * b; i++) {
                System.out.print(rank[i]+"-");
            }
        }
    }
}
