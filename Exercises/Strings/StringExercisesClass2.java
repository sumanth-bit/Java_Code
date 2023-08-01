package Exercises.Strings;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringExercisesClass2 {
    public static void main(String args[]){
        String last = "hihihihihihi";
        System.out.println(last.length());
        System.out.println("The last index of \"hi\" is "+last.lastIndexOf("hi") );// 0 based value

        //23. Write a Java program to find out whether a region in the current string matches a region in another string.
        String s1 = "Sumanth";
        String s2 = "Samantha";
        System.out.println(s1.substring(2,6).equals(s2.substring(2,6)));
        boolean match1 = s1.regionMatches(2,s2,2,5); // New Method
        System.out.println(match1);
        //24. Write a Java program to replace a specified character with another character.

        String s3 = s2.replace("S","H");
        System.out.println(s3);

        String s4 = "The quick brown fox jumps over the lazy dog fox.";
        s4 = s4.replace("fox","Cat");
        //s4.replaceAll("fox","Cat")
        System.out.println(s4);
        //26. Write a Java program to check whether a given string starts with another string.

        System.out.println(s4.startsWith("The"));
        //27. Write a Java program to get a substring of a given string at two specified positions.

        System.out.println(s4.substring(10,24));

        //28. Write a Java program to create a character array containing a string.
        char[][] arr = {{'j','a','v','a',' '},{'E','x','e','r','c','i','s','e'}};
        String s = new String(arr[0])+ new String(arr[1]);
        System.out.println(s.toCharArray());

        s2.endsWith("h");

        System.out.println(s2.substring(1,5).equals(s3.substring(1,5)));
        System.out.println(s2.equals(s4)); //equals method compare the content
        char[] char_array = {'H','e','l','l','o'};
        int[] arr1 = {1,2,3,4,5};
        //Byte array consists of any type of data which fits in single byte
        byte[] arr2 = {1,2,3,4,' '};
        System.out.println(arr1);
        int x = 2;
        System.out.println(arr2[1] == x);
        System.out.println(char_array);

        //29. Write a Java program to convert all characters in a string to lowercase.
        String array_string = new String(char_array);
        System.out.println(array_string.toLowerCase());

        //30. Write a Java program to convert all characters in a string to uppercase.
        System.out.println(array_string.toUpperCase());

        //31. Write a Java program to trim leading or trailing whitespace from a given string.
        String withSpaces = "  Hello Java  ";
        System.out.println(withSpaces.trim());

        StringTokenizer strTok = new StringTokenizer("Hello andi yela unnaru");
        while(strTok.hasMoreTokens()){
            System.out.print(strTok.nextToken()+" ");
        }
        while(strTok.hasMoreElements()){
            System.out.print(strTok.nextElement()+ " ");
        }
        //convert array to ArrayList
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        Arrays.stream(arr1).forEach(i->l.add(i));
        System.out.println(l);
        String palin = "theehtquickbrownfoxxofnworbquickthe";
        String str_result = " ";
        String answer = " ";
        boolean result = false;
        int max = 0;
        for(int i = 0; i< palin.length() ;i++){
            for(int j = i + 1; j< palin.length();j++){
                str_result = palin.substring(i,j + 1);
                result = checkPalindrome(str_result);
                if(result == true){
                    if((j-i) > max){
                        answer = str_result;

                        max = j - i;
                    }
                }


            }
        }
        System.out.println(answer);
        palin = "babad";
        str_result = "";
        String answer2 = "";
        String prev = "";
        boolean pop = false;

        Stack<String> stk = new Stack<>();
        for(int i = 0; i< palin.length(); i++) {

            if (stk.isEmpty()) {
               stk.push(String.valueOf(palin.charAt(i)));

            }
            else if (stk.peek().equals(String.valueOf(palin.charAt(i)))) {
                str_result = str_result + stk.pop();
                if (str_result.length() > answer2.length()) {
                    answer2 = str_result;
                }
                pop = true;

            } else {
                if (pop) {
                    stk.push(prev);
                    stk.push(prev);
                    stk.push(String.valueOf(palin.charAt(i)));
                    pop = false;
                } else {
                    stk.push(String.valueOf(palin.charAt(i)));
                    prev = String.valueOf(palin.charAt(i));
                }
                str_result = "";

            }



        }
        System.out.println(answer2);
        String result1 = answer2;
        answer2 = "";
        for(int i = 0; i< result1.length(); i++){
            answer2 = answer2+result1.charAt(i);
        }
       System.out.println(answer2+result1);




    }
    public static boolean checkPalindrome(String pl){
        int i = 0;
        int j = pl.length() - 1;


        while(i <= j){
            if(pl.charAt(i) != pl.charAt(j)){
                return false;
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }
}
