package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть больше 5 и
меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об
этом. Если пользователь ввёл не подходящее число, то программа должна просить
пользователя повторить ввод. Создайте второй массив только из чётных элементов
первого массива, если они там есть, и вывести его на экран.

 */
public class HW3_5dop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validNumber = false;
        while (!validNumber) {
            System.out.print("Введите размер массива: ");
            if (scan.hasNextInt()) {
                int size = scan.nextInt();
                if (size > 5 && size <= 10) {
                    validNumber = true;
                    int arr[] = new int[size];
                    Random rnd = new Random();

                    for (int i = 0; i < size; i++) {
                        arr[i] = rnd.nextInt(200);
                    }
                    System.out.print("Исходный массив: ");
                    System.out.println(Arrays.toString(arr));
                    int count = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            count++;
                        }
                    }
                    int secondArray[] = new int[count];
                    int newIndex = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            secondArray[newIndex] = arr[i];
                            newIndex++;
                        }
                    }
                    System.out.print("Массив, состоящий из четных элементов первого массива: ");
                    System.out.println(Arrays.toString(secondArray));

                } else
                    System.out.println("Размер массива должен быть больше 5 и меньше или равен 10. Введите размер массива, соответстсующий условию.");

            } else
                System.out.println("Размер массива должен быть больше 5 и меньше или равен 10. Введите размер массива, соответстсующий условию.");
            scan.nextLine();
        }
        scan.close();
    }
}

