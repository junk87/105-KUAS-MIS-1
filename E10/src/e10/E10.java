/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        float b[] = new float[a];
        float diff[] = new float[a];
        float sum1 = 0f;
        float sum2 = 0;
        for (int i = 0; i < a; i++) {
            b[i] = scn.nextInt();
            sum1 += b[i];
        }
        float avg = sum1 / a;
        for (int i = 0; i < a; i++) {
            diff[i] = Math.abs(b[i] - avg) * Math.abs(b[i] - avg);
            sum2 += diff[i];

        }
        float ans = Math.round((sum2 / a)*100) / (float)100;
        System.out.println(ans);
    }

}
