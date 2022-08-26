//1.3 jmu-Java-01入门-取数字
//https://pintia.cn/problem-sets/1542514312114589696/problems/1542514527521468418

import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            int a = Integer.parseInt(str);
            if (a >= 10000 && a <= 20000)
                System.out.println(Integer.toBinaryString(a) + ',' + Integer.toOctalString(a) + ',' + Integer.toHexString(a));
            else {
                Integer sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != '-') {
                        sum += str.charAt(i) - '0';
                        System.out.print((str.charAt(i) - '0') + " ");
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
