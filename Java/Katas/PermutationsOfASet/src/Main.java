import java.util.ArrayList;

/**
 *  Implement a function that gets all possible permutations (or orderings) of
 *  the characters in a string. For example for the input string "abc", the
 *  output will be "abc", "acb", "bac", "bca", "cab" and "cba".
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));
    }

    public static ArrayList<String> getPermutations(String s){
        ArrayList<String> result = new ArrayList<>();

        if(s.length()==1) {
            result.add(s);
            return result;
        }
        else {
            for(int i=0; i<s.length(); i++){
                char first = s.charAt(i);
                String remains = s.substring(0,i) + s.substring(i+1);
                ArrayList<String> innerPermutations = getPermutations(remains);

                for(int j=0; j<innerPermutations.size(); j++){
                    result.add(first + innerPermutations.get(j));
                }
            }
        }

        return result;
    }
}
