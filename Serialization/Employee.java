package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public long number;

    Employee(String name, long number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return "Employee name is "+name+" number is "+number;
    }



}
