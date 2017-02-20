/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d6.pkg2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a;
        if(a==1){
            System.out.println(1);
        }
       else if (a % 2 != 0) {
            int c[][] = new int[a][b];
            int ida = a / 2;
            int idb = a / 2;
            int rk[] = new int[a * b];
            rk[0] = ida * a + idb + 1;
            int ts = 1;
            int sum = 1;
            int mda = 0;
            int mdb = 0;
            System.out.print((ida * a + idb + 1) + "-");
            while (true) {
                if (ida - 1 < 0 || idb - 1 < 0 || ida + 1 > a - 1 || idb + 1 > a - 1) {
                    if (ida - 1 < 0) {
                        mda = (int) (Math.random() * 2);
                    }
                    if (idb - 1 < 0) {
                        mdb = (int) (Math.random() * 2);
                    }
                    if (ida + 1 > a - 1) {
                        mda = -((int) (Math.random() * 2));
                    }
                    if (idb + 1 > a - 1) {
                        mdb = -((int) (Math.random() * 2));
                    }
                } else {
                    mda = (int) (Math.random() * 3) - 1;
                    mdb = (int) (Math.random() * 3) - 1;
                }
                if (mda == 0 && mdb == 0) {
                    continue;
                } else {
                    ida += mda;
                    idb += mdb;
                    sum++;
                }
                if (c[ida][idb] < 1) {
                    c[ida][idb]++;
                    rk[ts] = ida * a + idb + 1;
                    ts++;
                }
                System.out.print((ida * a + idb + 1) + "-");
                if (ts == a * b) {
                    break;
                }

            }
            System.out.println();
            System.out.println(sum);
            for (int i = 0; i < a * b; i++) {
                System.out.print(rk[i] + "-");
            }
        }
    }

}
