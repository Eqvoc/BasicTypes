public class ReplaceWord {
    public static void main(String[] args) {
        String str1 = new String("Я говорю## всем ?! Я говорю каждый### раз ?! Даже ###когда не ###нужно!");
        String str2 = str1.replace("?", "Hello").replace("#", "");
        System.out.println(str2);
    }
}