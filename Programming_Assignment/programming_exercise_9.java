package Programming_Assignment;

/* Question:-
Write a program to delete all consonents from the string "Hello, have a good day"
*/

public class programming_exercise_9 {

    public static String removeVowels(String str) {
        return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");
    }

    public static void main(String[] args) {
        String str = "Hi, Good Morning";
        System.out.println("Original String: " + str);
        System.out.println("After removing Vowels: " + removeVowels(str));
    }
}