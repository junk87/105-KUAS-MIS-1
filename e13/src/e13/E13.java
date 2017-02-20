/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int up =scn.nextInt();
        int dw =scn.nextInt();
        int height=scn.nextInt();
        System.out.println(((up+dw)*height)/2);
    }
    
}
