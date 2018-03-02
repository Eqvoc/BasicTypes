import java.util.Random;

public class Money {

        public static void main(String[] args) {
            Random random = new Random();
            int anyNymber = random.nextInt(999);
            int valUnit1 = anyNymber % 10;
            int valUnit2= anyNymber % 100;
            if (( valUnit1 == 0) || (valUnit1 == 5) || (valUnit1 == 6) || (valUnit1 == 7) || (valUnit1 == 8) || (valUnit1 == 9) || (valUnit2 == 11) || (varnum2 == 12)
                    || (valUnit2 == 13) || (valUnit2 == 14)) System.out.println(anyNymber + " Рублей");
            else if (valUnit1 == 1) System.out.println(anyNymber + " Рубль");
            else if ((valUnit1 == 2) || (valUnit1 == 3) || (valUnit1 == 4)) System.out.println(anyNymber+ " Рубля");
        }
    }
