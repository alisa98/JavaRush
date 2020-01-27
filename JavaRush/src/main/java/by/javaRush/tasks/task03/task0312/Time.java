package by.javaRush.tasks.task03.task0312;

public class Time {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(24));
    }

    public static int convertToSeconds (int hours){
        return hours*3600;
    }
}
 //