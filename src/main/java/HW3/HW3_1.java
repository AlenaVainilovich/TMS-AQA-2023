package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */
public class HW3_1 {
    public static void main(String[] args) {
        int arr[] = new int[13];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }

        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            {
                boolean inc = false;
                for (int i = 0; i < arr.length; i++) {
                    if (a == arr[i]) {
                        inc = true;
                        break;
                    }
                }
                if (inc) {
                    System.out.println("Число " + a + " входит в массив");
                } else {
                    System.out.println("Число " + a + " не входит в массив");
                }
            }
        } else {
            System.out.println("Вы ввели не целое число!");
        }
        scan.close();
    }
}

