package by.javaRush.tasks.task03.task0318;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input name");
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        System.out.println("Input age");
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.

        System.out.println(name + " захватит мир через " + nAge +" лет. Му-ха-ха!");
    }
}
