public class Main {

    public static void main(String[] args) {
        String inputString = "!wow!";
        System.out.println(palindromeDetection(inputString));
    }

    public static boolean palindromeDetection(String s){
        String reversedS = new StringBuilder(s).reverse().toString();
        return s.equals(reversedS);
    }
}
