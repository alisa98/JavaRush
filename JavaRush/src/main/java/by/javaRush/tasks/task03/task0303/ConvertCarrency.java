package by.javaRush.tasks.task03.task0303;

public class ConvertCarrency {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,1.1));
        System.out.println(convertEurToUsd(8, 1.5));
    }

    public static double convertEurToUsd(double eur, double rate){
        return  eur * rate;
    }
}
