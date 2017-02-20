/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6;

/**
 *
 * @author user
 */    import java.util.Scanner;

public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn =new Scanner(System.in);
        String bf=scn.next();
        String af[]=bf.split("");
        for(int i=0;i<af.length;i++){
            char j=af[i].charAt(0);
            if(j>90){
                j=(char) (j-32);
            }
            if(j<65){
                j=48;
            }
            System.out.print(j);
        }
    }
    
}
