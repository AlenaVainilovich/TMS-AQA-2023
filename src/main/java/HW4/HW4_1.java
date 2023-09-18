package HW4;

import java.util.Random;
import java.util.Scanner;

/*
Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */
public class HW4_1 {
    public static void main(String[] args) {
        int[][][] array3D = new int[2][3][4];
        Random rnd = new Random();
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = rnd.nextInt(20);
                    System.out.print(array3D[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число, на которое будет увеличен каждый элемент массива: ");
        if (scan.hasNextInt()) {
            int inc = scan.nextInt();
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        array3D[i][j][k] += inc;
                        System.out.print(array3D[i][j][k] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } else System.out.print("Введите целое число: ");
    }
}
