/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e123;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class E123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       Scanner scn=new Scanner(System.in);
       String a=scn.next();
       String b[]=a.split(",");
       int c[]=new int[b.length];
       for(int i=0;i<b.length;i++){
           c[i]=Integer.valueOf(b[i]);
       }
       int d[]=tr(c,0);
       for(int i=0;i<d.length;i++){
           if(i<d.length-1){
               System.out.print(d[i]+",");
           }
           else{
               System.out.print(d[i]);
           }
       }
    }
    public static int[] tr(int a[],int b){
        if(b<a.length/2){
            int c=a[b];
            a[b]=a[a.length-1-b];
            a[a.length-1-b]=c;
            return tr(a,b+1);
        }
        else{
            return a;
        }
    }  
}
