package by.javaRush.tasks.task03.task0308;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int number){

       int result = 1;
        for (int i = 1; i<= number; i++){
            result*=i;
        }
        return result;
    }
}
