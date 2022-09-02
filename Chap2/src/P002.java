//jmu-Java-02基本语法-02-StringBuilder
import java.util.*;

public class P002
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            StringBuilder builder = new StringBuilder();
            int n = in.nextInt();
            int begin = in.nextInt();
            int end = in.nextInt();
            for (int i = 0; i < n; i++)
                builder.append(i);
            String ans = builder.substring(begin, end);
            System.out.println(ans);
        }
    }
}
