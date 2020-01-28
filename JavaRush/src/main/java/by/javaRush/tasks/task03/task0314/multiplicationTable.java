package by.javaRush.tasks.task03.task0314;

public class multiplicationTable {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable (){
        final int N = 10;
        int[][] table = new int[N][N];

        for(int i = 0; i < table.length; i++){
            table[i][0] = i+1;
            for (int j = 0; j < table.length; j++){
                table[0][j] = j+1;
                table[i][j] = table[i][0]*table[0][j];
            }
        }

        for(int i = 0; i < table.length; i++){
            for (int j = 0; j< table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();

        }

    }
}
