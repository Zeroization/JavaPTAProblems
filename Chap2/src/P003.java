//2.3 jmu-Java-02基本语法-03-身份证排序

import java.util.*;

public class P003
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] id = new String[n];
        String[] birth = new String[n];
        for (int i = 0; i < n; i++)
        {
            id[i] = in.nextLine();
            birth[i] = id[i].substring(6, 10) + "-" +id[i].substring(10, 12) + "-" + id[i].substring(12, 14);
        }
        MySort(id, birth);

        while (in.hasNext())
        {
            String op = in.nextLine();
            switch (op)
            {
                case "sort1":
                    for (String val : birth)
                        System.out.println(val);
                    break;
                case "sort2":
                    for (String val : id)
                        System.out.println(val);
                    break;
                default:
                    System.out.println("exit");
                    break;
            }
        }
    }
    public static void Swap(String[] arr, int a, int b)
    {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void MySort(String[] id, String[] birth)
    {
        //选择排序
        for (int i = 0; i < id.length; i++)
        {
            int minJ = i;
            for (int j = i; j < id.length; j++)
            {
                if (birth[minJ].compareTo(birth[j]) > 0)
                    minJ = j;
            }
            Swap(id, minJ, i);
            Swap(birth, minJ, i);
        }
    }
}
