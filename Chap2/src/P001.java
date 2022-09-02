//jmu-Java-02基本语法-01-综合小测验
import java.util.*;

public class P001
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] num = {};
        while (in.hasNext())
        {
            String op = in.nextLine();
            switch (op)
            {
                case "fib":
                    fib(Integer.parseInt(in.nextLine()));
                    break;
                case "sort":
                    //防止重复的sort出现，导致数据堆积
                    num = Arrays.copyOf(new int[0], 0);
                    String[] a = in.nextLine().split(" ");
                    for (String val: a)
                    {
                        num = Arrays.copyOf(num, num.length + 1);
                        num[num.length-1] = Integer.parseInt(val);
                    }
                    Arrays.sort(num);
                    System.out.println(Arrays.toString(num));
                    break;
                case "search":
                    int key = Integer.parseInt(in.nextLine());
                    if (Arrays.binarySearch(num, key)>=0)
                        System.out.println(Arrays.binarySearch(num, key));
                    else
                        System.out.println(-1);
                    break;
                case "getBirthDate":
                    int n = Integer.parseInt(in.nextLine());
                    while (n-- > 0)
                    {
                        String str = in.nextLine();
                        System.out.println(str.substring(6,10) + "-" + str.substring(10,12) + "-" + str.substring(12,14));
                    }
                    break;
                default:
                    System.out.println("exit");
                    break;
            }
        }
    }

    public static void fib(int x)
    {
        int[] arr = new int[100];
        arr[0] = arr[1] = 1;

        if (arr[x-1] == 0)
            for (int i = 2; i < x; i++)
                arr[i] = arr[i - 2] + arr[i - 1];

        System.out.print(arr[0]);
        for (int i = 1; i < x; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

}
