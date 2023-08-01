package OOPS;

class Vehicle{

    private String engine;
    private int wheels;
    private int seats;
    private String lights;

    Vehicle(){
        engine = "petrol";
        wheels = 4;
        seats = 4;
        lights = "LED";
    }

    Vehicle(String e, int wheels, int seats, String lights){
        this.engine = e;
        this.wheels = wheels;
        this.seats = seats;
        this.lights = lights;

    }
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getLights() {
        return lights;
    }

    public void run(){
        System.out.println("Vehicle runs if it is in good state");
    }
    public String toString(){
        return " Vehicle with Engine as "+engine+" seating capcity "+seats+" Lights are of type "+lights;
    }



}

class SUV extends Vehicle{

    private int capacity;

    SUV(String e, int wheels, int seats, String lights,int cap){
        super(e,wheels,seats,lights);
        capacity = cap;
    }
    SUV(){
        super();
        capacity = 5;
    }

    public void run(){
        System.out.println("SUV runs faster than normal vehicles");
    }

    public String toString(){
        return " SUV with Engine as "+getEngine()+" seating capcity "+getSeats()+" Lights are of type "+getLights()+"  runs faster with capacity "+capacity;
    }

}

public class InheritanceClass {

    public static void main(String args[]){
        Vehicle v = new SUV();
        System.out.println(v);
        Vehicle v1 = new  Vehicle();
        System.out.println(v1);

        Vehicle mahindra = new SUV("petrol",4,6,"LED",10);
        System.out.println(mahindra);

    }
}
