package by.javaRush.tasks.task02.task0214;

public class Solution {

    public static void main(String[] args){
        System.out.println(min(4,5));
        System.out.println(min(30,-3));
        System.out.println(min(1,1));

    }

    public static int min(int a, int b){
        if (a<b)
            return a;
        else
            return b;
    }
}
