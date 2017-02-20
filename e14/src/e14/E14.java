/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e14;

/**
 *
 * @author user
 */import java.util.Scanner;
public class E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(m==i*2+j*4&&n==i+j){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}
