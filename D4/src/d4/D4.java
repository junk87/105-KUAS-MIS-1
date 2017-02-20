/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a[] = {13, 7, 4, 8, 12, 22, 15, 18, 19, 10, 23, 25, 1, 27, 30};
        int sr = scn.nextInt();
        int h = a.length - 1;
        int l = 0;
        int k = (l + h) / 2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int c = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        while(a[k]!=sr){
            if(a[k]>sr){
                h=k-1;
            }
            if(a[k]<sr){
                l=k+1;
            }
            k = (l + h) / 2;
        }
        System.out.println();
        System.out.println(k+1);
    }

}
