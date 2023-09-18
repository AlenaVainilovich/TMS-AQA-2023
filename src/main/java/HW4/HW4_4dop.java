package HW4;

import java.util.Random;

/*
Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */
public class HW4_4dop {
    public static void main(String[] args) {
        int[][] array2D = new int[5][5];
        Random rnd = new Random();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = rnd.nextInt(20);
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
        }
        System.out.println();
        System.out.println("The sum of all array elements is equal to " + sum);
    }
}
