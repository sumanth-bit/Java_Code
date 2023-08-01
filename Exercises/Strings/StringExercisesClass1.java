//https://stackoverflow.com/questions/51598148/do-arrays-in-java-store-data-or-pointers
package Exercises.Strings;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.stream.*;

public class StringExercisesClass1 {

    public static void main(String args[]){

        //1. Write a Java program to get the character at the given index within the string.
        String s = "This String Example";
        String t = "This String Example2";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(10));

        //2. Write a Java program to get the character (Unicode code point) at the given index within the string.
        System.out.println("Unicode of "+s.charAt(1) +" is "+s.codePointAt(1));
        //3. Write a Java program to get the character (Unicode code point) before the specified index within the string.
        System.out.println(s.codePointAt(2-1));
        // codePointBefore(9); codePointAfter(9)

        // Please refer the book for getting clarity on UTF-8,UTF-16,UTF-32

        byte[] byte_arr = {127};
        String s1 = new String(byte_arr);
        byte b = '\u0061';
        byte c = '\u007F';
        System.out.println(b);
        System.out.println(c);
        System.out.println(s.codePoints().count());

        if(s.compareTo(t) == 1){
            System.out.println("S is greater than t");
        }
        else{
            System.out.println("t is greater that S");
        }

        String str = new String("Hello All");
        str.concat(" how are you");
        System.out.println(str);

        //6. Write a Java program to compare two strings lexicographically, ignoring case differences.

        if(s.compareToIgnoreCase(t) == 1){
            System.out.println("S is greater than t");
        }
        else{
            System.out.println("t is greater that S");
        }

        //7. Write a Java program to concatenate a given string to the end of another string.

        String f_name = "sumanth";
        String l_name = "paramkusam";
        f_name.concat(l_name); // This doesn't work because it creates a new object in String constant pool memory area
        System.out.println(f_name+" "+l_name);
        //8. Write a Java program to test if a given string contains the specified sequence of char values.
        //Here specified sequence of charaters is nothing but string
        //11. Write a Java program to create a String object with a character array.
        char[] c_array = {'s','u','m','a','n','t','h'};
        String arrays = new String(c_array,3,3);
        System.out.println(arrays);
        // So we have contains() method
        String details = "sumanth is working";
        details.contains(f_name);

        //9. Write a Java program to compare a given string to the specified character sequence.
        CharSequence cs = "example.com";
        // The below statement gives unicode representation in decimal numbers
        //for unicode representation i.e. in hex Format

        f_name.chars().forEach(i->System.out.print(i+" "));
        System.out.println();

        for(int i = 0; i <f_name.length(); i++){
            System.out.print(f_name.codePointAt(i)+" ");
        }
        System.out.println(details.contentEquals(l_name));

        StringBuffer strBuff = new StringBuffer("sumanth is working");
        System.out.println(details.contentEquals(strBuff));

        //12. Write a Java program to check whether a given string ends with another string.

        System.out.println(details.endsWith("working"));

        //13. Write a Java program to check whether two String objects contain the same data.
        s = new String("Hello");
        str = new String("Hello");
        System.out.println(s == str);// if object false, if literal is true

        // 14. Write a Java program to compare a given string to another string, ignoring case considerations.
        // for equals() we have equalsIgnoreCase() method

        System.out.println(s.equalsIgnoreCase(str));

        //15. Write a Java program to print the current date and time in the specified format
        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
        LocalTime time = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(time.getHour()+":"+time.getMinute()+" "+"pm");
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.YEAR+" "+cal.MONTH+" "+cal.DAY_OF_MONTH);

        //For am and pm try using Date()->SimpleDateFormat f->f.format(date)
        //Date is from java.uti,Date, SimpleDateFormat is from text.SimpleDateFormat
        Date date1 = new Date();
        SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm aa");
        String Time = formatTime.format(date1);
        System.out.println(Time);

        //16. Write a Java program to get the contents of a given string as a byte array.
        // In byte we give an integer it store it as integer that too -128 to +127
        // If we store any character it stores it's ascii value that too between -128 to + 127
        byte[] arr = str.getBytes();
        //17. Write a Java program to get the contents of a given string as a character array
        char[] arrchar = str.toCharArray();
        for(int i = 0; i<arrchar.length;i++){
            System.out.print(arrchar[i]);
        }
        //18. Write a Java program to create a distinct identifier for a given string.
        System.out.println(str.hashCode());
        String allAlpha = "The quick brown fox jumps over the lazy dog.";
        TreeMap<String,Integer> alpha = new TreeMap<>();
        for(int i = 0 ; i<allAlpha.length();i++){
            //System.out.println(allAlpha.charAt(i)+" "+allAlpha.indexOf(allAlpha.charAt(i)));
            if(allAlpha.charAt(i) >= 97 && allAlpha.charAt(i) < 123)
            {alpha.put(allAlpha.charAt(i)+" ",allAlpha.indexOf(allAlpha.charAt(i)));}


        }
        System.out.println(alpha);

        //20. Write a Java program to get the Canonical representation of the string object.

        String s2 = "Hello Sumanth";
        String s3 = new StringBuffer("Hello").append(" Sumanth").toString();
        /*
        1. Here you are creating a new StringBuffer in heapMemory,
        2. Appending a string and converting to String,
        3. But address stays in heap area and treated as String str = new String("Hello')
        4. to check if they are same are not, It says not same as address are different
        5. And also it is not created in String Constant Pool
        6. Once you use intern() method then it will be created in String pool and gives true

         */
        String s4 = s3.intern();
        System.out.println("With object and String literla "+(s3 == s2));
        System.out.println("With object after intern and String literal "+(s4 == s2));
        System.out.println("With object  and String literal only content "+(s2.contentEquals(s3)));
        //s3.append(" Bye ");
        System.out.println(s3);
        // if you want convert String Buffer to string, you need to use toString() method.

        StringBuilder s5 = new StringBuilder("Hello");
        System.out.println(s5);
        s5.deleteCharAt(3);
        System.out.println(s5);
        //21. Write a Java program to get the last index of a string within a string.
        System.out.println(s2.lastIndexOf("Sumanth"));
        //22. Write a Java program to get the length of a given string.
        System.out.println("This is using length() method "+s2.length());
        System.out.println("This is using codePoint().count  method "+s2.codePoints().count());















































    }

}
