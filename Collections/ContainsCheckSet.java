package Collections;
import java.util.*;

class Student{
    private int age;
    private String name;
    public static int count = 0;

    Student(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public String toString() {
        return "Student name " + name + " age is " + age;
    }
    public int compareTo(Student s){
        Integer k = this.age;
        Integer t = s.age;
        return k.compareTo(t);

    }
    public int hashCode(){
        return this.age+this.name.hashCode() + 23;
    }
    public boolean equals(Object s2) {
        count = count + 1;
        System.out.println("Count is "+count);
        System.out.println(s2.getClass());
        Student s1 = (Student) s2;
        System.out.println(s2.getClass());

        if (getClass() != s1.getClass()) {
            return false;
        }
        else if (age != s1.age) {
            System.out.println("False at age");
            return false;
        } else if (!(name.equals(name))) {
            System.out.println("False at Name");
            return false;
        }

        return true;
    }
}

public class ContainsCheckSet {

    public static void main(String args[]){
        Set<Student> s = new HashSet<>();
        s.add(new Student(21,"Sumanth"));
        s.add(new Student(21,"Sumanth"));
        System.out.println(s);
        System.out.println(s.contains(new Student(21,"Sumanth")));
        Set<String> s1 = new HashSet<>();
        s1.add("Sumanth");
        s1.add("Sumanth");

    }

}
