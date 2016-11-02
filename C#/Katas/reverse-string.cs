// Write a function that takes a string as input and returns the string reversed.
//
// Example:
// Given s = "hello", return "olleh".


public class Solution1 {
    public string ReverseString(string s) {
        char[] arr = s.ToCharArray();
        Array.Reverse(arr);

        string newS = new string(arr);

        return newS;
    }
}

public class Solution2 {
    public string ReverseString(string s) {
        return new string(s.ToCharArray().Reverse().ToArray());
    }
}
