/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m12;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class M12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn =new Scanner(System.in);
        int fun=scn.nextInt();
        float m=1f;
        float answer=0f;
        for(int i=1;i<=fun;i++){
            m*=2;
            answer+=1/m;
        }
        System.out.print(answer);
    }
    
}
