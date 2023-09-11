package HW2;
/*
Написать программу для вывода названия поры года по
номеру месяца. При решении используйте оператор if-else-if.
 */

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        if (scan.hasNextByte()) {
            byte monthNum = scan.nextByte();
            if (monthNum == 12 || monthNum == 1 || monthNum == 2) {
                System.out.println("Winter is coming!");
            } else if (monthNum >= 3 && monthNum <= 5) {
                System.out.println("Весна — время возрождения и новых начал");
            } else if (monthNum >= 6 && monthNum <= 8) {
                System.out.println("Лето - это маленькая жизнь");
            } else if (monthNum >= 9 && monthNum <= 11) {
                System.out.println("Что такое осень?");
            } else {
                System.out.println("Нет такого месяца в земном исчислении");
            }
        } else {
            System.out.println("Нет такого месяца в земном исчислении");
        }
        scan.close();
    }
}
