package GroupWork;

import java.util.Scanner;

public class Remove_Duplicate_Values_From_String {

    public static void main(String[] args) {

        String str = "cccccccddddaaaaaaabbbbbbbb";
        str = removeDuplicates(str);

        System.out.println(str);

    }
        public static String removeDuplicates(String str){ //"aaabbcc" ==> "abc"

            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(!result.contains(""+each)){
                    result += each;
                }

            }

            return result;

        }

    }
/*
Write a return program that can remove the duplicate
values from String Ex: ("AAABBBCCC") ==> ABC
 */
