package Exercises.Inheritance;

import java.time.LocalDate;

class Vehicle{
    public int make;
    public String model;
    public int year;
    public String fuel_type;

    Vehicle(int make,String model,int year,String fuel_type){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }

    public void calculate_fuel_eff(){
        System.out.println("Based on fuel");

    }
    public void distance_travelled(){
        System.out.println("Depends on the year");
    }

    public void maximum_speed(){
        System.out.println("It can go with a speed of ");
    }

}



class Truck extends Vehicle{

    Truck(int make,String model,int year,String fuel_type){
       super(make,model,year,fuel_type);
    }

    public void calculate_fuel_eff(){
        System.out.println("Fuel type is "+fuel_type+" it is less effient");

    }
    public void distance_travelled(){
        LocalDate l = LocalDate.now();
        if(l.getYear() - year > 2)
            System.out.println("Since the  the year");
        else
            System.out.println("Only 2000 kms below");
    }

    public void maximum_speed(){
        System.out.println("It can go with a speed of 40kms/hr");
    }
}
class Car extends Vehicle{

    Car(int make,String model,int year,String fuel_type){
        super(make,model,year,fuel_type);
    }

    public void calculate_fuel_eff(){
        System.out.println("Fuel type is "+fuel_type+" it is less effient");

    }
    public void distance_travelled(){
        LocalDate l = LocalDate.now();
        if(l.getYear() - year > 2)
            System.out.println("Since the  the year");
        else
            System.out.println("Only 2000 kms below");
    }

    public void maximum_speed(){
        System.out.println("It can go with a speed of 40kms/hr");
    }
}

public class InheritanceExerciseClass3 {
    public static void main(String args[]){
        Vehicle v1 = new Truck(1,"Mahindra",2010,"Diesel");
        Vehicle v2 = new Car(1,"Mahindra",2023,"Diesel");
        v1.calculate_fuel_eff();
        v1.distance_travelled();
        v1.maximum_speed();
        v2.calculate_fuel_eff();
        v2.distance_travelled();
        v2.maximum_speed();
    }
}
