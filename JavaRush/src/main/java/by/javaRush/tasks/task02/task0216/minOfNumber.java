package by.javaRush.tasks.task02.task0216;


public class minOfNumber {
    public static void main(String[] args)
    {
        System.out.println(min(1, 2, 3, 4));
        System.out.println(min(2, 1, 4, 3));
        System.out.println(min(1, 1, 3, 3));
        System.out.println(min(1, 1, 1, 1));
    }

    public static int min(int a, int b, int c, int d){
        if( min(a,b) < min(c,d)) return min(a,b);
            else if (min(a,b) == min(d,c)) return min(a,b);
        else return min(a,b);
    }

    public static int min(int a, int b){
        if (a<=b)
            return a;
        else
            return b;
    }
}
