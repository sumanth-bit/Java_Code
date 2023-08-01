package OOPS;

class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public void features(){
        System.out.println("Feature phone");
    }

    public String getModel() {
        return model;
    }

}
class Nokia extends Phone {

    public Nokia(String model) {
        super(model);
    }

}

class Samsung extends Phone{

    public Samsung(String model) {
        super(model);
    }

    public void features(){
        System.out.println("Andriod flagship");
    }



}

public class PolymorphismClass {
    public static void main(String[] args) {


        Phone nokia3310 = new PolymorphismClass().phone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.features();



        Phone note8 =  new PolymorphismClass().phone(2);
        System.out.println(note8.getModel());
        note8.features();




    }
    public Phone phone(int dailyDriver){
        switch(dailyDriver){
            case 1: return new Nokia("3310");
            case 2: return new Samsung("Note 5");
        }
        return null;
    }
}
