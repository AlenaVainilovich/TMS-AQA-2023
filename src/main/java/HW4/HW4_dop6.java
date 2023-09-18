package HW4;

import java.util.Arrays;
import java.util.Random;

/*
Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class HW4_dop6 {
    public static void main(String[] args) {
        int[][] array2D = new int[3][7];
        Random rnd = new Random();
        System.out.println("Source array:");

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = rnd.nextInt(50);
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2D.length; i++) {
            Arrays.sort(array2D[i]);
        }

        System.out.println();
        System.out.println("Sorted array:");

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

