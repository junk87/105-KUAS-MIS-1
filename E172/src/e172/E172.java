/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e172;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        while (true) {
            int a = scn.nextInt();
            if (a == 0) {
                break;
            }
            int b[] = new int[a];
            for(int i=0;i<a;i++){
                b[i]=scn.nextInt();
                while(b[i]>1000||b[i]<0){
                    System.out.println("請重新輸入");
                    b[i]=scn.nextInt();
                }
            }
            int min = 1000;
            for (int i = 1; i < a; i++) {
                if(Math.abs(b[i]-b[i-1])<min){
                    min=Math.abs(b[i]-b[i-1]);
                }
            }
            System.out.println(min);
        }
    }

}
