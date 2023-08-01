package Core_Java;
enum Learning {
    COREJAVA(2), COLLECTIONS(3),GENERICS(1),JSPSERVLETS(6),MULTITHREADING(20);
    int value;
    Learning(int i) {
        this.value = i;
    }
}

public class EnumClass {
    public static void main(String[] args){
        Learning l = Learning.COREJAVA;
        switch(l){
            case COREJAVA:
                System.out.println("This is Core Java Tutorial");
                break;
            case COLLECTIONS:
                System.out.println("This is Collections Tutorial");
                break;
            case GENERICS:
                System.out.println("This is Generic tutorial");
                break;
            case JSPSERVLETS:
                System.out.println("This is JSPServlets Tutorial");
                break;
            case MULTITHREADING:
                System.out.println("This is MultiThreading Tutorial");
                break;
        }

        for (Learning k :Learning.values()){
            System.out.println(k.ordinal());

        }

    }
}
