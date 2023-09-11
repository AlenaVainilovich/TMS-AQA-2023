package HW2;
/*
Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор switch-case.
 */

public class HW2_1 {
    public static void main(String[] args) {
        byte monthNum = 7;
        switch (monthNum) {
            case 12, 1, 2:
                System.out.println("Winter is coming");
                break;
            case 3, 4, 5:
                System.out.println("Весна — время возрождения и новых начал");
                break;
            case 6, 7, 8:
                System.out.println("Лето - это маленькая жизнь");
                break;
            case 9, 10, 11:
                System.out.println("Что такое осень");
                break;
            default:
                System.out.println("Нет такого месяца в земном исчислении");
        }
    }
}
