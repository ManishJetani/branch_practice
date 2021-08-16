package org.example;

public class ExtraClassPractice
{
    public void whileLoop ()
    {   int n = 7;
        int i = 0;
        while (n%2==0)
        {

        }
    }
    public void add()
    {   int total = 0;
        int month = 0;
        for (int i = 550; i <=5500 ; i+=550)
        {   month = month+1;
            total = total+550;
        }
        System.out.println(total);
        System.out.println("total month :"+month);
    }

    public static void main(String[] args)
    {   ExtraClassPractice extraClassPractice = new ExtraClassPractice();
        extraClassPractice.add();
        int a =5;
//        int b = ++a;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
//        System.out.println(b);
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 23.33;
        char[] c = new char[2];
        c[0] = 's';
        //Object array, Object is a class to use different data types
        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] = 25;
        ob[2] = 12.33;
        ob[3] = "1/1/1990";
        ob[4] = 'm';
        ob[5] = "London";
        System.out.println(ob[4]);
    }

}
