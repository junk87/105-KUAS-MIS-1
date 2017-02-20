/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e20;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i=2;i<=a;i++){
             while(a%i==0){
                 System.out.println(i);
                 a/=i;
             }
       /* for (int i = 2; i <= a; i++) {
            System.out.println(i);
           /* if (a % i == 0) {
                System.out.println(i);
                a /= i;
                i --;}*/
            }
        }
    }


