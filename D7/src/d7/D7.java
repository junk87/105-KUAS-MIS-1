/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int nr = n - 1;
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = n-1; j >= 0; j--) {
                b[i][n-j-1] = a[i][j];
                System.out.print(b[i][n-j-1]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[j][i];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
