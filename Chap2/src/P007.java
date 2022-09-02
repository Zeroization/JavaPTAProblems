//2.7 jmu-Java-02基本语法-08-ArrayList入门

import java.util.*;

public class P007
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();

        //输入: n个字符串，放入strList。直到输入为!!end!!时，结束输入。
        String str = in.next();
        while (!str.equals("!!end!!"))
        {
            strList.add(str);
            str = in.next();
        }
        //在strList头部新增一个begin，尾部新增一个end。
        strList.add(0, "begin");
        strList.add("end");
        //输出列表元素
        System.out.println(strList);

        //输入: 字符串str
        str = in.next();
        //判断strList中有无包含字符串str，如包含输出true，否则输出false。并且输出下标，没包含返回-1。
        int index = strList.indexOf(str);
        if (index != -1)
            System.out.println("true\n" + index);
        else
            System.out.println("false\n" + index);
        //在strList中从后往前找str。返回其下标，找不到返回-1。
        index = strList.lastIndexOf(str);
        System.out.println(index);
        //移除掉第1个(下标为0)元素,并输出。然后输出列表元素。
        System.out.println(strList.get(0));
        strList.remove(0);
        System.out.println(strList);

        //输入: 字符串str
        str = in.next();
        //将第2个（下标为1）元素设置为字符串str.
        strList.set(1, str);
        //输出列表元素
        System.out.println(strList);

        //输入: 字符串str
        str = in.next();
        //遍历strList，将字符串中包含str的元素放入另外一个ArrayList strList1，然后输出strList1。
        ArrayList<String> strList1 = new ArrayList<>();
        for (String eachItem : strList)
            if (eachItem.contains(str))
                strList1.add(eachItem);
        System.out.println(strList1);
        //在strList中使用remove方法，移除第一个和str相等的元素。
        strList.remove(str);
        //输出strList列表元素。
        System.out.println(strList);
        //使用clear方法，清空strList。然后输出strList的内容，size()与isEmpty()，3者之间用,连接。
        strList.clear();
        System.out.println(strList + "," +  strList.size() + "," + strList.isEmpty());
    }
}
