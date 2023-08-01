package Exercises.Inheritance;
import java.util.*;

class Animal {
    public void makeSound(){
        System.out.println("Animal Makes Sound");
    }

}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat meows");
    }

}

class Employee{
    private int ID;
    private String name;

    /*
    1.We can use Employee class name inside the class also
    2. for example: List<Employee> l = new ArrayList<>();
    3. We send a parameter as Employee class Object i.e
    4. addEmployee(Employee e){
        l.add(e)}
    5. But for Every employee they should have same list so we should make it as static
     */

    Employee(int id,String name){
        this.ID = id;
        this.name = name;
    }

    public void work(){
        System.out.println("Employee working on a project");
    }

    public void getSalary(){
        System.out.println("He/She gets salary at the end of the month");
    }

    public String toString(){
        return this.name+" is an employe with ID "+this.ID;
    }

}

class HRManager{
    List<Employee> l = new ArrayList<>();
    public void work(){
        System.out.println("Adds employee");
        listOdAddedEmployee();

    }
    public void addEmployee(Employee e){
        l.add(e);
        System.out.println("Added an employee");

    }

    public void listOdAddedEmployee(){
        System.out.println(l);
    }
}
public class InheritanceExerciseClass {

    public static void main(String args[]){
        Animal a = new Cat();
        // Only overridden method can be called using the parent class object
        a.makeSound();
        Employee e = new Employee(1,"Sumanth");
        HRManager vijay = new HRManager();
        vijay.addEmployee(e);
        vijay.work();
        e.work();

    }

}
