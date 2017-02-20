package m20;
import java.util.Scanner;
public class M20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pw = scn.next();
        int t = 0;
        while (true) {
            String log = scn.next();
            if (pw.equals(log)) {
                System.out.println("密碼輸入正確，歡迎使用本系統!!");
                break;
            } else {
                t++;
            }
            if (t == 3) {
                System.out.println("密碼輸入超過三次!!");
                break;
            }
        }
    }
}
