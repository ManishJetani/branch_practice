package org.example;

public class CodingPractice
{
    public static void main(String[] args)
    {   //storing variable
        String name = "bamboo";
        int count = 0;

        //converting string into char array
        char String[] = name.toCharArray();

        for (int i = 0; i <=name.length() ; i++)
        {
            for (int j = i+1; j<name.length();)
            {
                if (String[i]==String[j])
                {
                    count = count+1;
                }
                break;
            }
        }
        if (count==1)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("0");
        }

    }
}
