/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d9;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入個數:");
        int sum = scn.nextInt();
        int a[] = new int[sum];
        int b[] = new int[sum];
        System.out.print("輸入整數陣列a:");
        for (int i = 0; i < sum; i++) {
            a[i] = scn.nextInt();
        }
        System.out.print("輸入整數陣列b:");
        for (int i = 0; i < sum; i++) {
            b[i] = scn.nextInt();
        }
        System.out.print("排序後陣列a:");
        for (int i = 0; i < sum; i++) {
            if (a[i] < b[i]) {
                int c = b[i];
                b[i] = a[i];
                a[i] = c;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("排序後陣列b:");
        for (int i = 0; i < sum; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
