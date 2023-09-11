package HW2;

/*
По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).
 */
public class HW2_5 {
    public static void main(String[] args) {
        byte colorOfRainbow = 7;
        switch (colorOfRainbow) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Где вы видели в радуге такой цвет?");
        }
    }
}
