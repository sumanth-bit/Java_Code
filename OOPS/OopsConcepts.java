package OOPS;


class Car {
    private String doors;
    private String engine;
    private String drivers;

    public int speed;

    // Default Constructor

    public Car(){
        doors = "opened";
        engine ="off";
        speed = 0;

    }
    public Car (String d,String e, int s){
        this.doors = d;
        this.engine = e;
        this.speed = s;
    }

   public void setDoors(String d){
       this.doors = d;

   }
   public void setEngine(String e){
       this.engine = e;
   }
    public void setSpeed(int speed){
       this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
   public String run(){
       if((doors == "closed") && (engine == "on") && (speed >0)){
           return "car is running";
   }
       else{
           return "car is not running";
       }
   }

}
public class OopsConcepts {

    public static void main(String[] args){
        Car car = new Car();
        car.setSpeed(23);
        System.out.println(car.getSpeed());
        System.out.println(car.run());
        Car car2 = new Car ("closed","on",23);
        car.setDoors("closed");
        car.setEngine("on");
        System.out.println(car2.run());

    }

}
