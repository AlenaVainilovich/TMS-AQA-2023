package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
 */
public class HW3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        if (scan.hasNextInt()) {
            int size = scan.nextInt();
            if (size > 0) {
                int arr[] = new int[size];
                Random rnd = new Random();

                for (int i = 0; i < size; i++) {
                    arr[i] = rnd.nextInt(200);
                }
                System.out.println(Arrays.toString(arr));

                int max = arr[0];
                int min = arr[0];
                int sum = 0;
                float avr = 0;
                for (int i = 0; i < size; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    sum += arr[i];
                }

                avr = (float) sum / size;

                System.out.println("Максимальное значение в массиве: " + max);
                System.out.println("Минимальное значение в массиве: " + min);
                System.out.println("Среднее значение массива : " + avr);
            } else {
                System.out.println("Число должно быть целым положительным!");
            }
        } else {
            System.out.println("Введите корректный размер массива!");
        }
        scan.close();
    }
}
