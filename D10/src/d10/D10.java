package d10;

import java.util.Scanner;

public class D10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("請輸入階數:");
            int stage = scn.nextInt();
            if (stage == 0) {
                break;
            }
            if (stage % 2 != 0 && stage <= 15) {
                int arr[][] = new int[stage][stage];
                int ida = 0;
                int idb = stage / 2;
                for (int i = 1; i <= stage * stage; i++) {
                    arr[ida][idb] = i;
                    int preida = ida;
                    int preidb = idb;
                    ida--;
                    idb++;
                    if (ida < 0) {
                        ida = stage - 1;
                    }
                    if (idb > stage - 1) {
                        idb = 0;
                    }
                    if (arr[ida][idb] != 0) {
                        preida++;
                        if (preida > stage - 1) {
                            preida = 0;
                        }
                        ida = preida;
                        idb = preidb;
                    }
                }
                for (int i = 0; i < stage; i++) {
                    for (int j = 0; j < stage; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                continue;
            }
        }
    }
}
