package m13;

import java.util.Scanner;

public class M13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int a[] = new int[49];
        int b[] = new int[49];
        for (int i = 1; i <= N; i++) {
            int lotto = (int) ((Math.random() * 49));
            a[lotto]++;
        }
        
        int max = a[0];
        int value = 0;
        int s=6;
       if(N<6){
           s=N;
       }
        for (int j = 0; j < s; j++) {
            for (int i = 0; i < 49; i++) {
                if (a[i] > max) {
                    max = a[i];
                    value = i;
                }
                
            }
            System.out.println("號碼:" + (value + 1) + "次數:" + max);
            a[value] = -a[value];
            max = 0;
        }
    }
}
