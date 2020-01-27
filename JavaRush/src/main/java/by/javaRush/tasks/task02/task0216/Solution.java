package by.javaRush.tasks.task02.task0216;

public class Solution {
    public static void main(String[] args){
        System.out.println(min(1, 2, 3));
        System.out.println(min(2, 1, 3));
        System.out.println(min(2, 3, 1));
        System.out.println(min(1, 1, 2));
        System.out.println(min(1, 2, 1));
        System.out.println(min(2, 1, 1));
        System.out.println(min(1, 1, 1));
    }

    public static int min(int a, int b, int c)
    {
        if(a < b && a < c) return a;
             else if ( a > c) return c;
                else if ( a == b && a <= c) return a;
                 else if ( a == c && a < b)  return a;
        if (a > b && b < c ) return b;
            else if (a > b && b == c) return b;
        if ( a > b && b > c) return c;
        return 0;
    }
}
