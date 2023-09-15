package HW3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив и заполните массив. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
экран на отдельной строке.
 */
public class HW3_6dop {
    public static void main(String[] args) {
        Random rdn = new Random();
        int arr[] = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdn.nextInt(200);
        }
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.print("Массив с замененными элементами: ");
        System.out.println(Arrays.toString(arr));
    }
}

