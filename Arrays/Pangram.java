package Arrays;

// import java.util.HashSet;
// import java.util.Set;

//A pangram is a sentence where every letter of the English alphabet appears at least once.
public class Pangram {
    // iterate over every character in string, if any of the alphabet is not present
    // in the string then return false, else true
    static boolean checkIfPangram(String sentence) {
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    // we can also do this with Set
    // static boolean checkIfPangram(String sentence) {
    // Set<Character> charArr = new HashSet<>();
    // // Set doesnt add duplicate elements
    // for (int i = 0; i < sentence.length(); i++) {
    // charArr.add(sentence.charAt(i)); // adding character to the array
    // }
    // return charArr.size() == 26;
    // }

    // public static void main(String[] args) {
    // String sentence = "Leetcode";
    // boolean isPangram = true;
    // for (int i = 0; i < 26; i++) {
    // char c = (char) ('a' + i);
    // if (sentence.indexOf(c) == -1) {
    // isPangram = false;
    // }
    // }
    // System.out.println(isPangram);
    // }
}
