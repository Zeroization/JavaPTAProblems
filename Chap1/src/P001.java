//第一个PTA上Java程序 https://pintia.cn/problem-sets/1542514312114589696/problems/1542514527521468416
import java.util.Scanner;
public class P001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (Math.abs(a) > 1000)
                System.out.println("|a|>1000");
            else
                System.out.println(a + b);
        }
    }

}
