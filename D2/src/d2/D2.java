/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

/**
 *
 * @author user
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {23, 54, 6, 87, 30, 47, 13, 17, 91, 72};
        int b[] = new int[a.length];
        int mini = a[0];
        int index = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < a.length; i++) {
                if (mini > a[i]) {
                    mini = a[i];
                    index = i;
                }
            }
            b[j]=mini;
            a[index]+=100000;
            mini=a[j];
            System.out.print(b[j]+" ");
        }
    }
}
