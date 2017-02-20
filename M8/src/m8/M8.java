
package m8;

import java.util.Scanner;
public class M8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String id = scn.next();
        String split[] = id.split("");
        int ten = 0;
        int number[] = new int[split.length];
        char first = split[0].charAt(0);
        int firstnumber = 0;
        if (first >= 65 && first <= 72) {
            firstnumber = (int) first - 55;
        }
        if (first > 73 && first <= 78) {
            firstnumber = (int) first - 56;
        }
        if (first > 79 && first <= 90) {
            if (first == 89 || first == 88) {
                firstnumber = (int) first - 58;
            }
            if (first == 87) {
                firstnumber = (int) first - 55;
            }

            firstnumber = (int) first - 57;
        }
        int answer = 0;
        int pos = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i * 10 + j == firstnumber) {
                    ten = i;
                    number[0] = j;
                }
            }
        }
        for (int i = 1; i < split.length; i++) {
            number[i] = Integer.valueOf(split[i]).intValue();
        }
        for (int i = 9; i >= 1; i--) {
            answer += number[pos] * i;
            pos++;
        }
        answer += number[9] + ten;
        System.out.println(answer);
        System.out.print("此身分證字號為");
        if (answer % 10 == 0) {
            System.out.print("真!");
        } else {
            System.out.print("假!");
        }
    }

}
