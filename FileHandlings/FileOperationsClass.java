package FileHandlings;
import java.io.*;

public class FileOperationsClass {

    public static void main(String args[]){

        // This is to crate a directory File CLass mkdir() and mkdirs() for sub-directories
        File directory = new File("PracticeFiles");
        directory.mkdir();

        // We can use same file object inorder to create a new file or Create a new File object

        File file = new File("PracticeFiles//myfile.txt");
        // This might throw IO exception so handle with try/catch
        try {
            file.createNewFile();
        }
        catch(IOException e){
            System.out.println("Could not create a file");

        }

        // Writing into the File we use BufferedWriter and FileWriter with File object.
        // This also has to be in the try as it also might throw IO exception
        // If only 1 line throws exception we can directly mention as this way

        // We have "append" flag which appends the data in file at the end instead of removing
        // or overriding it

        // This implementation is called Try() with resources
        // If you use it this way then it will be closed automatically no need explicit closing
        // Other "Resources leak" might occur
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){

            bw.write("Sumanth\n");
            bw.write("Komali\n");
            bw.write("Vani");
            bw.newLine();
            bw.write("Balaram\n");
            bw.write("Nagaratnam\n");

            // we can use \n in at the end for newline or newLine() methodn

        }
        catch(IOException e){
            System.out.println("Cannot write into the file");
        }

        //  We will read the data in the file using BufferedReader and FileReader and File object

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                else{
                    System.out.println(line);
                }
            }
            br.close();

        }
        catch(IOException e){
            System.out.println("Couldn't read the file");
        }

        //deleting a File

        file = new File("PracticeFiles//deleting_file");
        try {
            file.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(file.delete()){
            System.out.println(" File is Deleted");

        }
        else{
            System.out.println("Error in deleting file");
        }




    }
}
