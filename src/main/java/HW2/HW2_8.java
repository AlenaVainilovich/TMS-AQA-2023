package HW2;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
введенного  пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
 */
public class HW2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num > 0) {
                int i = 1;
                int sum = 0;
                while (i <= num) {
                    sum = sum + i;
                    i++;
                }
                System.out.println("Сумма всех чисел " + sum);
            } else {
                System.out.println("Вы ввели не целое положительное число");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число");
        }
        scan.close();
    }
}

