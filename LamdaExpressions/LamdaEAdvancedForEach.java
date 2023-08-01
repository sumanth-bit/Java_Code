package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

public class LamdaEAdvancedForEach {

    public static void main(String args[]){
        List<Person> l1 = new ArrayList<>();
        l1.add(new Person("Sumanth"));
        l1.add(new Person("Komali"));
        l1.add(new Person("Vani"));
        l1.add(new Person("Balaram"));

        l1.forEach((item) -> {
            System.out.print(item.getName());
            System.out.println(" "+item.getName().length());

        });




    }


}
