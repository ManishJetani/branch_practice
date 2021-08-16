package org.example;

public class Hello
{   int nums [] = {2,7,11,15};
    int target = 15;
    public int[] twoSum()
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }

    public static void main(String[] args)
    {
        Hello hello = new Hello();
        hello.twoSum();
        System.out.println("hello");
    }

}
