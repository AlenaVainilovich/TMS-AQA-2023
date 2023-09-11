package HW2;

/*
Выведите на экран первые 11 членов последовательности Фибоначчи.
 */
public class HW2_12dop {
    public static void main(String[] args) {
        int count = 11;
        int [] febbon = new int[count];
        febbon[0]=0;
        febbon[1]=1;
        for(int i = 2; i < count; i++) {
            febbon[i] = febbon[i-1] + febbon[i-2];
        }
        for(int i = 0; i < count; i++) {
            System.out.print(febbon[i] + " ");
        }
    }
}