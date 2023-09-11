package HW2;

/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
 */
public class HW2_11 {
    public static void main(String[] args) {
        int i;
        int square;
        for (i = 10; i <= 20; i++) {
            square = i * i;
            System.out.println("Квадрат числа " + i + " равен " + square);
        }
    }

}
