package by.javaRush.tasks.task01.task0129;

public class Circle {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength (double radius){

        double Pi = 3.14;
        double L = 2* Pi * radius;
        System.out.println(L);
    }
}