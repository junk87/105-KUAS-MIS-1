/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

/**
 *
 * @author user
 */
public class D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 500);
            a[i] = x;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (a[j] < a[j - 1]) {
                    int c = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = c;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]+" ");
        }

    }
}