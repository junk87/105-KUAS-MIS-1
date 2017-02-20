package m14;
public class M14 {
    public static void main(String[] args) {
        int sale[][] = {{33, 32, 56, 45, 33}, {77, 33, 68, 45, 23}, {43, 55, 43, 67, 65}};
        int money[][] = new int[3][5];
        int a[] = new int[money.length];
        int b[] = new int[money[0].length];
        for (int i = 0; i < sale.length; i++) {
            for (int j = 0; j < sale[i].length; j++) {
                if (j == 0) {
                    money[i][j] += sale[i][j] * 12;
                }
                if (j == 1) {
                    money[i][j] += sale[i][j] * 16;
                }
                if (j == 2) {
                    money[i][j] += sale[i][j] * 10;
                }
                if (j == 3) {
                    money[i][j] += sale[i][j] * 14;
                }
                if (j == 4) {
                    money[i][j] += sale[i][j] * 15;
                }
            }
        }
        for (int i = 0; i < sale.length; i++) {
            for (int j = 0; j < sale[i].length; j++) {
                if (i == 0) {
                    a[0] += money[i][j];
                    if (j == sale[i].length - 1) {
                        System.out.println("銷售員1 " + a[0]);
                    }
                }
                if (i == 1) {
                    a[1] += money[i][j];
                    if (j == sale[i].length - 1) {
                        System.out.println("銷售員2 " + a[1]);
                    }
                }
                if (i == 2) {
                    a[2] += money[i][j];
                    if (j == sale[i].length - 1) {
                        System.out.println("銷售員3 " + a[2]);
                    }
                }
                if (j == 0) {
                    b[0] += money[i][j];
                }
                if (j == 1) {
                    b[1] += money[i][j];
                }
                if (j == 2) {
                    b[2] += money[i][j];
                }
                if (j == 3) {
                    b[3] += money[i][j];
                }
                if (j == 4) {
                    b[4] += money[i][j];
                }

            }
        }
        System.out.println("商品A " + b[0]);
        System.out.println("商品B " + b[1]);
        System.out.println("商品C " + b[2]);
        System.out.println("商品D " + b[3]);
        System.out.println("商品E " + b[4]);
        int max1 = a[0];
        int max2 = b[0];
        for (int i = 0; i < a.length; i++) {
            if (max1 < a[i]) {
                max1 = a[i];
            }
            if (i == a.length - 1) {
                for (int k = 0; k < a.length; k++) {
                    if(a[k]==max1){
                        System.out.println("最好銷售員:"+(k+1));
                    }
                }
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (max2 < b[j]) {
                    max1 = b[j];
                }
                if (j == b.length - 1) {
                for (int k = 0; k < b.length; k++) {
                    if(b[k]==max1){
                        System.out.println("最好商品:"+((char)(k+65)));
                    }
                }
                }
            }
        }
    }
