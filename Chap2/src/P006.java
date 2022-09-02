//2.6 jmu-Java-02基本语法-04-动态数组

import java.util.*;

public class P006
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int n = in.nextInt();
            String[][] ans = new String[n][];
            for (int i = 0; i < n; i++)
            {
                ans[i] = new String[i + 1];
                for (int j = 0; j < i + 1; j++)
                {
                    ans[i][j] = String.format("%d*%d=%d", i + 1, j + 1, (i + 1) * (j + 1));
                    if (j < i)
                        System.out.printf("%-7s",ans[i][j]);
                    else
                        System.out.println(ans[i][j]);
                }
            }
            System.out.println(Arrays.deepToString(ans));
        }
    }
}
