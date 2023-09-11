package HW2;
/*
Напишите программу, которая выводит на консоль таблицу умножения.
 */
public class HW2_14dop {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}
