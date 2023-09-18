package HW4;

import java.util.Arrays;

/*
Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
B(Black) или W(White).
 */
public class HW4_2 {
    public static void main(String[] args) {
        String chessArray[][] = new String[8][8];
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    chessArray[i][j] = "W";
                } else if (i % 2 != 0 && j % 2 != 0) {
                    chessArray[i][j] = "W";
                } else
                    chessArray[i][j] = "B";
                System.out.print(chessArray[i][j] + " \t");
            }
            System.out.println();
        }
    }
}


