import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//      1. Given two strings, check if the strings are equal. After that, concatenate them into one single string
        String stringExample1 = "This is string 1";
        String stringExample2 = "This is string 2";
        String concatenatedString = "";

        if(stringExample1 != stringExample2){
            concatenatedString = stringExample1 + " and " + stringExample2;
        }

        System.out.println(concatenatedString);
//      2. Given a one word string, return true if the string is a palindrome (word that reads the same forwards or backwards - e.g. madam, mom, abba )
        String checkForPalindrome = "Madam";

        checkForPalindrome = checkForPalindrome.toLowerCase();

        StringBuilder normalString = new StringBuilder(checkForPalindrome);
        StringBuilder reversedString = normalString.reverse();

        if(reversedString.toString().contentEquals(checkForPalindrome)){
            System.out.println("The word \"" + checkForPalindrome + "\" it's a palindrome");
        }else{
            System.out.println("The word \"" + checkForPalindrome + "\" it's not a palindrome");
        }

//      3. Create an empty string, an empty array of strings, and a list of strings with random upper and lowercase letters:
        String emptyString;
        String[] emptyArrayString;
        List<String> listOfStrings = Arrays.asList("", "", "", "", "");

        Random randomNumber = new Random();
        String dictionary = "abcdefghijnklmnopqrstuvwxyz";




        for(int i=0; i<listOfStrings.size(); i++){
            int randomInt = randomNumber.nextInt(dictionary.length());
            Character randomChar = dictionary.charAt(randomInt);
            listOfStrings.set(i, String.valueOf(randomChar));
        }
        System.out.println("The list of chars is" + listOfStrings);


    }
}
