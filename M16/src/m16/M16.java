/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m16;

/**
 *
 * @author user
 */
public class M16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            long a=fib(48);
            System.out.println(a);
    }
    public static long fib(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return (long)((long)fib(n-1)+(long)fib(n-2));
        }
    }
    
}
