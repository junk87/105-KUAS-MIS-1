/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scn = new Scanner(System.in);
        System.out.print("輸入籃球員人數  (1~10):");
        int amount = scn.nextInt();
        if (amount <= 10 && amount >= 1) {
            int score[] = new int[amount];
            int assist[] = new int[amount];
            int board[] = new int[amount];
            int steal[] = new int[amount];
            int miss[] = new int[amount];
            int player[] = new int[amount];
            for (int i = 0; i < amount; i++) {
                System.out.print("籃球員" + (i + 1) + "得分、助攻、籃板、抄截、失誤)：");
                score[i] = scn.nextInt();
                assist[i] = scn.nextInt();
                board[i] = scn.nextInt();
                steal[i] = scn.nextInt();
                miss[i] = scn.nextInt();
                player[i] = score[i] + (assist[i] * 2) + (board[i] * 2) + (steal[i] * 2) - (miss[i] * 2);

            }
            for (int i = 0; i < amount; i++) {
                System.out.print("籃球員" + (i + 1) + ":");
                if (player[i] > 45) {
                    System.out.print("A級球員");
                }
                if (player[i] < 45 && player[i] >= 35) {
                    System.out.print("B級球員");
                }
                if (player[i] < 35 && player[i] >= 25) {
                    System.out.print("板凳級球員");
                }
                if (player[i] < 25) {
                    System.out.print("萬年板凳球員");
                }
                System.out.println();
            }

        }
    }
}
