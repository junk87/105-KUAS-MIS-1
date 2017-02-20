/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15;

/**
 *
 * @author user
 */import java.util.Scanner;
public class E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println(Math.round(((5f/9f)*((float)a-32f))*10f)/10f);
    }
    
}
