public class StringLine {

    public static void main(String[] args) {

        String str = new String("Единственный способ стать умнее — играть с более умным противником.");
        System.out.println("Длина строки: " + str.length());
        int partLine = str.length() / 2;
        String lineSub1 = str.substring(0, partLine);
        String lineSub2= str.substring(partLine);
        System.out.println(lineSub1);
        System.out.println(lineSub2);


    }
}