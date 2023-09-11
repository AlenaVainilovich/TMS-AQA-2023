package HW2;
/*
Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').
 */

import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Число чётное");
            } else
                System.out.println("Число нечетное");
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scan.close();
    }
}
