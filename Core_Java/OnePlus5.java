package Core_Java;

class oneplus implements InterfaceClass {
    public String processor(){
        return "A11";

    }
    public String OS(){
        return "IOS";
    }

    public int spaceInGB(){
        return 64;
    }
}

public class OnePlus5{
    public static void main(String [] args){
        InterfaceClass phone1 = new oneplus();
        System.out.println(phone1.OS());
        System.out.println(phone1.processor());
        System.out.println(phone1.spaceInGB());
    }
}



