package OOPS;
class Person {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }
    public boolean setAge(int age) {
        if (age >=0 && age <=100){
            this.age = age;
            return true;
        }
        return false;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class EncapsulationClass {
    public static void main(String[] args) {

        Person john = new Person();
        john.setName ("John");
        john.setAge (-10);
        john.setGender ("Male");

        System.out.println (john.getName());
        System.out.println (john.getAge());
        System.out.println (john.getGender());

    }
}
