/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m112;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String fst = "52704456";
        String snd[] = {"95358086", "35867930", "14013695"};
        int n = scn.nextInt();
        int best = 0;
        int p[] = new int[6];
        String nb[] = new String[n];
        for (int i = 0; i < n; i++) {
            nb[i] = scn.next();
        }
        for (int i = 0; i < n; i++) {
            if (nb[i].equals(fst)) {
                best++;
                continue;
            }
            for (int k = 0; k < snd.length; k++) {
                for (int j = 0; j <= 5; j++) {
                    if (nb[i].substring(j).equals(snd[k].substring(j))) {
                        p[j]++;
                        break;
                    }
                }
            }
        }
        if (best > 0) {
            System.out.println("特獎:"+best);
        }
        if (p[0] > 0) {
            System.out.println("頭獎:"+p[0]);
        }
        if (p[1] > 0) {
            System.out.println("二獎:"+p[1]);
        }
        if (p[2] > 0) {
            System.out.println("三獎:"+p[2]);
        }
        if (p[3] > 0) {
            System.out.println("四獎:"+p[3]);
        }
        if (p[4] > 0) {
            System.out.println("五獎:"+p[4]);
        }
        if (p[5] > 0) {
            System.out.println("六獎:"+p[5]);
        }
        System.out.println(best * 2000000 + p[0] * 200000 + p[1] * 40000 + p[2] * 10000 + p[3] * 4000 + p[4] * 1000 + p[5] * 200);
    }

}
