package by.javaRush.tasks.task01.task0136;

public class Weight {

    public static void main(String[] args){

        System.out.println(getWeight(100));
    }

    public static double getWeight (int weight){

        double MoonWeigth = weight/100*17;
        return MoonWeigth;
    }

}
