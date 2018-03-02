import java.util.Random;

public class Radius {
    public static void main(String[] args) {
        Random anyNumber = new Random();
        int a = anyNumber.nextInt(100) + 1;
        int b = anyNumber.nextInt(100) + 1;
        int r = anyNumber.nextInt(95) + 1;
        System.out.println(a + " " + b + " " + r);
        int trigon = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        int circle = r * 2;
        System.out.println("Треугольник: " + trigon);
        System.out.println("Окружность: " + circle);

        if (circle >= trigon) {

            System.out.println("полностью закрыт круглой картонкой радиусом " + r);

        } else {
            
            System.out.println("не закрывает полностью круглой картонкой радиусом " + r);

        }
    }
}
