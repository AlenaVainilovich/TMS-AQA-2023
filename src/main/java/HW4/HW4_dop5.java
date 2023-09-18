package HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class HW4_dop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n > 0) {
                int[][] array2D = new int[n][n];
                Random rnd = new Random();

                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        array2D[i][j] = rnd.nextInt(40);
                        System.out.print(array2D[i][j] + "\t");
                    }
                    System.out.println();
                }

                int[] mainDiagonal = new int[n];
                int diagonalElement;
                int[] antiDiagonal = new int[n];

                for (int i = 0; i < array2D.length; i++) {
                    diagonalElement = array2D[i][i];
                    mainDiagonal[i] = diagonalElement;
                }

                for (int i = 0; i < array2D.length; i++) {
                    for (int j = array2D[i].length - 1 - i; j >= 0; j--) {
                        if (i == array2D.length - j - 1) {
                            diagonalElement = array2D[i][j];
                            antiDiagonal[i] = diagonalElement;
                        }
                    }
                }

                System.out.println("Main diagonal:");
                System.out.println(Arrays.toString(mainDiagonal));
                System.out.println("Antidiagonal:");
                System.out.print(Arrays.toString(antiDiagonal));

            } else {
                System.out.println("Вы ввели не положительное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scan.close();
    }
}
