package HW2;
/*
Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».
 */

import java.util.Scanner;

public class HW2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение температуры:");
        if (scan.hasNextByte()) {
            byte temp = scan.nextByte();
            if (temp <= -20) {
                System.out.println("Холодно");
            } else if (temp > -20 && temp <= -5) {
                System.out.println("Нормально");
            } else {
                System.out.println("Тепло");
            }
        } else {
            System.out.println("Определяем температуру только для землян");
        }
        scan.close();
    }
}

