package HW2;

import java.util.Scanner;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц. Для вычисления суммы с
учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
*/
public class HW2_13dop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");

        if (scan.hasNextFloat()) {
            float deposit = scan.nextFloat();

            if (deposit > 0) {
                System.out.println("Введите количество месяцев:");

                if (scan.hasNextInt()) {
                    int monthCount = scan.nextInt();
                    float percent;
                    int month;
                    float sum = deposit;

                    for (month = 1; month < monthCount; month++) {
                        percent = (sum * 7) / 100;
                        sum += percent; // sum = sum + percent
                    }
                    System.out.println("Конечная сумма вклада с учётом процентов за время вклада равна " + sum);
                } else {
                    System.out.println("Вы ввели некорректное количество месяцев");
                }
            } else {
                System.out.println("Введите корректно сумму вклада");
            }
        }
    }
}



