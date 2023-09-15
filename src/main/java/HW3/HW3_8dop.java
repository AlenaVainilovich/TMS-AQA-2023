package HW3;

import java.util.Arrays;
import java.util.Random;


/*
Реализуйте алгоритм сортировки пузырьком.
 */
public class HW3_8dop {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }
        System.out.print("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        boolean swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Поменять элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // Если внутренний цикл не выполнил ни одной замены, массив уже отсортирован
            if (!swap) {
                break;
            }
        }

        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));

    }
}


