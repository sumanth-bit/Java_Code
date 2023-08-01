package Core_Java;

class Door1{


    /* Here we are creating a local inner class, which is
    created inside a method
    We use Local Inner class when we call a method and if it returns true
    which further creates an Object and if there is validation.

     */

    public boolean isLocked(String k){
        class Lock1{
            public boolean isLocked(String key){
                if(key.equals("sumanth")){
                    System.out.println("it is not locked");
                    return false;

                }
                else{
                    System.out.println("it is not locked");
                    return true;
                }
            }
        }
        return new Lock1().isLocked(k);
    }
}
 class LocalInnerClass {
    public static void main(String args[]){
        Door1 d = new Door1();
        d.isLocked("sumanth");

    }

}
