package GroupWork;

import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.frequency;

public class Unique_Character_FromThe_String {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = "";

        System.out.println("Enter a word");
        word = scan.nextLine();

uniqueCharacters(word);
    }

    public static void uniqueCharacters(String word) {
        String str = "aabccdeef";
        String result = ""; //bdf //declare variable

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'A'
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }


        System.out.println(result);




    }
}






/*
Write a program that can find the unique characters from the
 String Ex: ("AAABBBCCCDEF") ==> "DEF";
 */