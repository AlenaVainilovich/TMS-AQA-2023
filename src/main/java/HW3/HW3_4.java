package HW3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class HW3_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int arr1[] = new int[5];
        int arr2[] = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rnd.nextInt(200);
            arr2[i] = rnd.nextInt(200);
        }
        System.out.print("Массив 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Массив 2: ");
        System.out.println(Arrays.toString(arr2));

        int sumArr1 = 0;
        int sumArr2 = 0;
        float avr1;
        float avr2;

        for (int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }

        avr1 = (float) sumArr1 / arr1.length;
        avr2 = (float) sumArr2 / arr2.length;

        System.out.println("Среднее арифметическое элементов первого массива равно: " + avr1);
        System.out.println("Среднее арифметическое элементов первого массива равно: " + avr2);

        if (avr1 > avr2) {
            System.out.println("Среднее арифметическое элементов первого массива больше" +
                    " cреднего арифметического элементов второго массива");
        } else if (avr2 > avr1) {
            System.out.println("Среднее арифметическое элементов второго массива больше" +
                    " cреднего арифметического элементов первого массива");
        } else {
            System.out.println("Средние арифметические элементов обоих массивов равны");
        }
    }
}

