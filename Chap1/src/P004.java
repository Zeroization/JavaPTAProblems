//1.4 jmu-Java-01入门-取数字浮点数
//https://pintia.cn/problem-sets/1542514312114589696/problems/1542514527521468419
import java.util.Scanner;

public class P004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int sum = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    sum += (str.charAt(i) - '0');
            System.out.println(sum);
        }
    }
}
