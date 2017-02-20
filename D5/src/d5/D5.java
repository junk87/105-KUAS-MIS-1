package d5;
import java.util.Stack;
public class D5 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        String poker[] = {"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "sj", "sq", "sk", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "hj", "hq", "hk", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "dj", "dq", "dk", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cj", "cq", "ck"};
        String e[] = new String[13];
        String s[] = new String[13];
        String w[] = new String[13];
        String n[] = new String[13];
        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * 52);
            int b = (int) (Math.random() * 52);
            String c = poker[a];
            poker[a] = poker[b];
            poker[b] = c;
        }
        for (int i = 0; i < 52; i++) {
            st.push(poker[i]);
        }
        for (int i = 0; i <= 12; i++) {
            e[i] = st.pop();
            s[i] = st.pop();
            w[i] = st.pop();
            n[i] = st.pop();
        }
        System.out.print("東家:");
        for (int i = 0; i <= 12; i++) {
            System.out.print(e[i]+" ");
        }
        System.out.println();
        System.out.print("南家:");
        for (int i = 0; i <= 12; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
        System.out.print("北家:");
        for (int i = 0; i <= 12; i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.print("西家:");
        for (int i = 0; i <= 12; i++) {
            System.out.print(w[i]+" ");
        }
        System.out.println();
    }
    }
    

