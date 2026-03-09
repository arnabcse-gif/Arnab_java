import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1 Change case
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = changeCase(str);
        System.out.println("The string after changing the case is " + result);

        // 2 Reverse
        result = reverseString(str);
        System.out.println("The string after reversing is " + result);

        // 3 Compare strings
        System.out.print("Enter second string for comparison: ");
        String str2 = sc.nextLine();

        compareStrings(str, str2);

        // 4 Insert string
        System.out.print("Enter string to be inserted: ");
        String insert = sc.nextLine();

        System.out.println("The string after insertion is: " + insertString(str, insert));

        // 5 Uppercase and lowercase
        convertCase(str);

        // 6 Character position
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        checkCharacter(str, ch);

        sc.nextLine(); // clear buffer

        // 7 Palindrome
        System.out.print("Enter string for palindrome check: ");
        String p = sc.nextLine();

        checkPalindrome(p);

        // 8 Count words vowels consonants
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        countWords(sentence);
    }

    // Change case
    static String changeCase(String str) {

        return str.toUpperCase();
    }

    // Reverse string
    static String reverseString(String str) {

        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    // Compare ASCII difference
    static void compareStrings(String s1, String s2) {

        int diff = Math.abs(s1.compareTo(s2));
        System.out.println("The difference between ASCII value is " + diff);
    }

    // Insert string
    static String insertString(String s1, String s2) {

        return s1 + " " + s2;
    }

    // Uppercase and lowercase
    static void convertCase(String s) {

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
    }

    // Character position
    static void checkCharacter(String s, char c) {

        int pos = s.indexOf(c);

        if(pos >= 0)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");
    }

    // Palindrome check
    static void checkPalindrome(String s) {

        String rev = new StringBuffer(s).reverse().toString();

        if(s.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }

    // Count words vowels consonants
    static void countWords(String s) {

        int words = s.trim().split("\\s+").length;

        int vowels = 0;
        int consonants = 0;

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c >= 'a' && c <= 'z') {

                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}