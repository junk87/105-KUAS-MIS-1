/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m132;
import java.util.Scanner;/**
 *
 * @author user
 */
public class M132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int ts=scn.nextInt();
        int number[]=new int[49];
        for(int i=1;i<=ts;i++){
            int random=(int)(Math.random()*49);
            number[random]++;
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<49;j++){
                
            }
        }
    }
    
}
