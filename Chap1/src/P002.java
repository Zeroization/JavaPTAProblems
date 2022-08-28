//1.2 jmu-java-01入门-基本输入
//https://pintia.cn/problem-sets/1542514312114589696/problems/1542514527521468417
import java.util.Scanner;
public class P002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
