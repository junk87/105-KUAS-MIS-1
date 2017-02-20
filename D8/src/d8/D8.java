/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d8;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int lotto[] = {8, 15, 19, 22, 29, 37, 39};
        int t = scn.nextInt();
        boolean check = false;
        boolean check2 = false;
        if (t >= 1 && t <= 3) {
            int auto[][] = new int[t][6];
            //int auto[][] = {{15, 19, 22, 30, 37, 39}, {11, 19, 22, 30, 38, 39}};
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 6; j++) {
                    auto[i][j] = (int) (Math.random() * 49) + 1;
                    if (j > 0) {
                        for (int k = j - 1; k >= 0; k--) {
                            if (auto[i][j] == auto[i][k]) {
                                check = true;
                                break;
                            }
                        }
                    }
                    if (check) {
                        j--;
                        check = false;
                        continue;
                    }
                    System.out.print(auto[i][j] + "　");
                }
                System.out.println();
            }
            int sr = 0;
            int sp = 0;
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (auto[i][j] == lotto[k]) {
                            sr++;
                            break;
                        }
                    }
                    if (auto[i][j] == lotto[6] && sp == 0) {
                        check2 = true;
                    }
                }
                if (check2) {
                    if (sr == 5) {
                        System.out.println("自動選號"+(i+1)+"為:"+"貳獎");
                    }
                    if (sr == 4) {
                        System.out.println("自動選號"+(i+1)+"為:"+"肆獎");
                    }
                    if (sr == 3) {
                        System.out.println("自動選號"+(i+1)+"為:"+"陸獎");

                    }
                    if (sr == 2) {
                        System.out.println("自動選號"+(i+1)+"為:"+"柒獎");

                    }
                } else {
                    if (sr == 6) {
                        System.out.println("自動選號"+(i+1)+"為:"+"頭獎");
                    }
                    if (sr == 5) {
                        System.out.println("自動選號"+(i+1)+"為:"+"參獎");
                    }
                    if (sr == 4) {
                        System.out.println("自動選號"+(i+1)+"為:"+"伍獎");
                    }
                }
                check2 = false;
                sr = 0;
            }
        }
    }
}
