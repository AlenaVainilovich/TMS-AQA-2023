package HW3;

import com.github.javafaker.Faker;

import java.util.Arrays;

/*
Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив. Результат выведите на консоль.
 */
public class HW3_7dop {
    public static void main(String[] args) {
        String[] names = new String[7];
        Faker faker = new Faker();
        for (int i = 0; i < names.length; i++) {
            names[i] = faker.name().firstName();
        }
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.print("Отсортированный массив: ");
        System.out.print(Arrays.toString(names));
    }
}
