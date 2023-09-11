package HW2;

/*
При помощи цикла for вывести на экран нечетные числа от 1 до 99.  При решении используйте операцию инкремента (++).
 */
public class HW2_6 {
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 99; num++) {
            System.out.println(num);
            num++;
        }
    }
}

   /*
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 99; num = num + 2) {
            System.out.println(num);
        }
    }
    */
    /*
    public static void main(String[] args) {
        int num;
        for (num = 0; num < 100; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }*/

