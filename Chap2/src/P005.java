//2.5 jmu-Java-02基本语法-05-浮点数的精确计算

import java.util.*;
import java.math.*;

public class P005
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String[] arr = in.nextLine().split(" ");
            BigDecimal a = new BigDecimal(arr[0]);
            BigDecimal b = new BigDecimal(arr[1]);

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
