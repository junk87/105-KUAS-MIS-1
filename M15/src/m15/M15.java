package m15;

import java.util.Scanner;

public class M15 {

    public static void main(String[] args) {
        int n = 0;
        float x = 0.1f;
        float a = 0f;
        float sum=0f;
        for (int i = 10; i >= 0; i--) {
            n = fact(i);
            a = power(x, i);
            sum+=a/n;
        }
        System.out.println(sum);
    }

    public static float power(float x, int n) {
        float a=x;
        if (n == 0) {
            return 1.0f;
        }
        if (n == 1) {
            return x;
        } else {
            //for(int i=2;i<=n;i++){
              //  a*=x;
              return x*power(x,n-1);
            }
            //return a;
        }
    

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
