/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m72;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int t240 = 0;
        int t480 = 0;
        int t481 = 0;
        System.out.print("開始停車時間");
        int sh = scn.nextInt();
        int sm = scn.nextInt();
        System.out.print("結束停車時間");
        int eh = scn.nextInt();
        int em = scn.nextInt();
        int t = Math.abs((eh * 60 + em) - (sh * 60 + sm));
        if (t < 30) {
            System.out.println("免費");
        } else {
            if (t > 240) {
                t481 = ((t - 240) / 30) * 60;
                t = 240;
            }
            if (t > 120 && t <= 240) {
                t480 = ((t - 120) / 30) * 40;
                t = 120;
            }
            if (t <= 120) {
                t240 = (t / 30) * 30;
            }
            System.out.println(t481 + t480 + t240);
        }
    }

}
