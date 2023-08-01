package FileHandlings;
import javax.annotation.processing.Filer;
import java.io.*;

public class IOOperationsClass {
    public static void main(String args[]) throws IOException{
        File fw1 = new File("practice2.txt");
        fw1.createNewFile();
        try {

            FileWriter fw2 = new FileWriter(fw1);

            BufferedWriter bw = new BufferedWriter((fw2));
            bw.write("Hello Guys How are you I'm doing Good ");
            bw.write("Sumanth",0, 7 );
            bw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

        FileReader fr = new FileReader(fw1);
        int i;
        //String s;

        while((i = fr.read()) != -1){
//            s = s + (char)i;
//            if(s == "Hello"){
//                new IOOperationsClass.writeInFile("Sumanth",fr);
//            }

            System.out.print((char)i);

        }
        FileReader fr2 = new FileReader(fw1);

        BufferedReader br = new BufferedReader(fr2);
        int s;
        System.out.println();

        while((s = br.read()) != -1){
            System.out.print((char)s);

        }


    }

//    public void write(String s, FileReader f) throws IOException{
//        BufferedWriter br = new BufferedWriter(f);
//        br.write(s);
//
//    }
}
