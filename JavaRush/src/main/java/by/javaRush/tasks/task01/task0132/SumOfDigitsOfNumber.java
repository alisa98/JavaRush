package by.javaRush.tasks.task01.task0132;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println( sumDigitsInNumber(564));

    }

    public static int sumDigitsInNumber (int number){
        int sumDigitsInNumber = 0;
        while (number !=0){
            sumDigitsInNumber += number % 10;
            number/=10;
        }
        return sumDigitsInNumber;
    }
}
