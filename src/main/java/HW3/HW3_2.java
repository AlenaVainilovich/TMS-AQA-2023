package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
Пусть число задается с консоли (класс Scanner).
Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
*/
public class HW3_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }
        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (a != arr[i]) {
                        count++;
                    }
                }
                int resultArr[] = new int[count];
                int newIndex = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (a != arr[i]) {
                        resultArr[newIndex] = arr[i];
                        newIndex++;
                    }
                }
                if (count != arr.length) {
                    System.out.println("Новый массив: ");
                    System.out.print(Arrays.toString(resultArr));
                } else {
                    System.out.println("Введённое число не найдено в данном массиве.");
                }
            }
        } else System.out.println("Введите целое положительное число!");
        scan.close();
    }
}



