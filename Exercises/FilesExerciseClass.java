package Exercises;
import java.io.*;
import java.util.*;
import java.util.Date;


public class FilesExerciseClass {
    public static void main(String args[]) throws IOException{

        //1. Write a Java program to get a list of all file/directory names in the given directory.
        File f = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java");
        for(String s: f.list()){
            System.out.println(s);
        }

        //2. Write a Java program to get specific files with extensions from a specified folder.
        File f2 = new File("C:\\Users\\suman\\Downloads");
        String list[] = f2.list((File dir,String name)->{
            if(name.toLowerCase().endsWith(".jpeg")){
                return true;
            }
            else{
                return false;
            }
        });
        System.out.println("******************");
        for(String e: list) {
            System.out.println(e);
        }

        //3. Write a Java program to check if a file or directory specified by pathname exists or not.
        //Even if the path is wrong we will not get any issue while instantiating File Objects
        System.out.println("******************");
        File f3 = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Python\\python_file.py");
        if(f3.exists()){
            System.out.println("File exists in the given directory");
        }
        else{
            System.out.println("File or Directory does not exists");
        }

        //4. Write a Java program to check if a file or directory has read and write permissions
        System.out.println("******************");
        File f4 = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\Arrays\\App.java");
        if (f4.exists()) {

            if (f4.canWrite() && f4.canRead()) {
                System.out.println("App.java file can be written and Read");

            } else {
                System.out.println("App.java file cannot be written and Read");

            }

            if (f4.canExecute()) {
                System.out.println("File can be executed");
            } else {
                System.out.println("File cannot be executed");

            }
            //5. Write a Java program to check if the given pathname is a directory or a file.
        }
            if(f4.isFile())
            {System.out.println("It is a file");}
            else
            {System.out.println("It is not a file");}
            if(f2.isDirectory()){
                System.out.println("It is a directory");
            }

            //6. Write a Java program to compare two File names lexicographically.

            String s1 = "python.py";
            String s2 = "java.java";
            String s3 = "java.java";

            System.out.println(s1.compareTo(s2));
            System.out.println(s2.compareTo(s3));


            //7. Write a Java program to determine the last modified date of a file.
            System.out.println(new Date(f4.lastModified()).getDate());

            //8. Write a Java program to read input from the Java console.

            //9. Write a Java program to get the file size in bytes, KB, MB.

            if(f4.exists()){
                System.out.println("File size in bytes "+f3.length());
                System.out.println("File size in Kilo Bytes "+f3.length()/(1024));
                System.out.println("File size in Mega Bytes  "+f3.length()/(1024*1024));

            }

            //10. Write a Java program to read the contents of a file into a byte array.

            BufferedInputStream bw = new BufferedInputStream(new FileInputStream(f3));
            int i;
            while((i = bw.read()) != -1 ){
                System.out.print((char)i);

            }

            //15. Write a Java program to write and read a plain text file.
        //16. Write a Java program to append text to an existing file.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice2.txt",true));
            writer.write("\nThis is going to be the longest word- ihatestudyingbutcanothelp");
            writer.close();

            //11. Write a Java program to read file content line by line.
        //12. Write a Java program to read a plain text file.

        List<String> l1 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice2.txt"));
            String k;
            String entire_data = "";
            while((k = br.readLine()) != null){

                System.out.println(k);
                //System.out.println(br.readLine()); remember every readline() goes to the next Line so it is mandatory it assign it in while

                //13. Write a Java program to read a file line by line and store it in a variable.
                entire_data = entire_data + k;
                l1.add(k);


            }

            // reads byte by byte i.e. character by character
        int l;
        while((l = br.read()) != -1){

            System.out.println((char)l);
            //System.out.println(br.readLine()); remember every readline() goes to the next Line so it is mandatory it assign it in while

        }
        System.out.println(entire_data);
        System.out.println(l1);

        //18. Write a Java program to find the longest word in a text file.

        // read word by word we use scanner class hasNext(),next() method in the file
        Scanner sc = new Scanner(new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice2.txt"));
        String current="";
        String LongString="";

        while(sc.hasNext()){
            current = sc.next();
            if(current.length() > LongString.length()){
                LongString = current;
            }

        }
        System.out.println(LongString);

        //17. Write a Java program to read the first 3 lines of a file.
            













    }





    }



