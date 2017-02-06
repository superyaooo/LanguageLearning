import java.util.ArrayList;

/**
 * Implement a function that gets all possible combinations (or subsets) of the
 * characters in a string with length of at least one. For example for the input
 * string "abc", the output will be "a", "b", "c", "ab", "ac", "bc" and "abc".
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(getCombinations("abcde"));
    }

    public static ArrayList<String> getCombinations(String s){
        ArrayList<String> combinations = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            int resultLength = combinations.size();
            for(int j=0; j<resultLength; j++){
                combinations.add(s.charAt(i) + combinations.get(j));
            }
            combinations.add(Character.toString(s.charAt(i)));
        }

        return combinations;
    }
}
