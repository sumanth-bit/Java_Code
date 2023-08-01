/* In this program we talk about Wildcards<?> which are generic
classes with type are limited that is we can have a upper bound and
a lower bound
 */
package Generics;
import java.util.*;
class Vehicle{
    private int VehicleId;

    Vehicle(int Id){
        VehicleId = Id;
    }
    public int getVehicleId(){return VehicleId;}
    public String toString(){

        return "Vehicle ID is "+VehicleId;
    }

}
class Car extends  Vehicle{

    private int CarId;
    Car(int v,int c){
        super(v);
        CarId = c;
    }

    public int getCarId(){return CarId;}
    public String toString() {
        return "Car [CarId=" + CarId + "]";
    }

}

public class Wildcards{
    public static void main(String[] args){
        List<Vehicle> l1= new ArrayList<>();
        l1.add(new Vehicle(1));
        l1.add(new Car(1,21));
        display(l1);
        display2(l1);
    }
    public static void display(List<? extends Vehicle> list){
        for(Vehicle l : list){
            System.out.println(l);
        }
    }
    public static void display2(List<? super Car> list){
        for(Object l : list){
            System.out.println(l);
        }
    }


}

/* Polymorphism example for overriding a method and calling it
in lower bound in generic is not possible it has a restriction
 */