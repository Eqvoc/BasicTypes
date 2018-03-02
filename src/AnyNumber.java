import java.util.Random;

public class AnyNumber {

    public static void main(String[] args) {
        Random anyNumber= new Random();
        int number= anyNumber.nextInt(999);
        if(number % 10 == 7) {
            System.out.println(number + " является числом 7");
        } else {
            System.out.println(number + " не является числом 7");
        }
    }
}