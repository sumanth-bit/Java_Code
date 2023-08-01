package OOPS;
import java.util.*;
class StudentList implements Comparable<StudentList>{
    private int rollno;
    private String name;

    StudentList(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int compareTo(StudentList s){
        if(this.rollno < s.rollno){
            return -1;

        }
        else if(this.rollno > s.rollno){
            return 1;
        }
        else {
            return 0;
        }

    }
    public String toString(){
        return this.rollno+" "+this.name;
    }




}
public class ComparableInterface {
    public static void main(String args[]){
        List<StudentList> l1 = new ArrayList<>();
        l1.add(new StudentList(1,"Sumanth"));
        l1.add(new StudentList(2,"Komali"));
        l1.add(new StudentList(3,"Vani"));
        l1.add(new StudentList(4,"Amma"));

        Collections.sort(l1);
        for(StudentList s: l1){
            System.out.println(s);
        }





    }

}
