/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m18;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class M18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                if (year % 4000 != 0) {
                    System.out.println(year + "是閏年");
                } else {
                    System.out.println(year + "不是閏年");
                }
            } else {
                System.out.println(year + "不是閏年");
            }
        } else {
            System.out.println(year + "不是閏年");
        }
    }

}
