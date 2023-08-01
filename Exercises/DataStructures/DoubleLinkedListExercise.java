package Exercises.DataStructures;
class DoubleNode{

    public int data;
    public DoubleNode next;
    public DoubleNode prev;

    DoubleNode(int ele){
        this.data = ele;
        this.next = null;
        this.prev = null;
    }

}

class DoubleLinkedList{
    public DoubleNode head;
    int size = 0;

    DoubleLinkedList(){
        this.head = null;
    }

    public void insert(int x,String loc, int pos){
        DoubleNode new_node = new DoubleNode(x);
        DoubleNode temp = head;
        if(head == null){
            head = new_node;
            size = size + 1;
            System.out.println("First Element is inserted");
            display();
        }
        else{
            if(loc.toLowerCase().equals("start")){
                new_node.next = head;
                head.prev = new_node;
                head = new_node;
                size = size + 1;
                System.out.println("Element is inserted at "+loc);
                display();

            }
            else if(loc.toLowerCase().equals("end")){
                while(temp.next != null){
                    temp = temp.next;
                }
                new_node.prev = temp;
                temp.next = new_node;
                size = size + 1;
                System.out.println("Element is inserted at "+ loc);
                display();
            }
            else{
                int count = 1;
                while(temp.next != null){
                    temp = temp.next;
                    count = count + 1;
                    if(count == pos){
                        //System.out.println(temp.data);
                        break;
                    }
                }
                new_node.next = temp;
                new_node.prev = temp.prev;
                temp.prev.next = new_node;
                temp.prev = new_node;
                size = size + 1;
                System.out.println("Element is inserted at "+ pos+" position");
                display();
            }


        }
    }

    public void delete(int pos){

        if(pos> this.size){
           System.out.println("Position is more that size, Please try another position");
           return;
        }
        DoubleNode temp = head;
        int count = 1;
        while(temp.next != null){
            if(count == pos){
                break;
            }
            temp = temp.next;
            count = count + 1;
        }

        temp.prev.next = temp.next;
        System.out.println("Element is deleted at position "+pos);
        display();
    }


    public void display(){
        DoubleNode temp = head;
        System.out.print("null");
        while(temp != null){
            System.out.print("<-"+temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }




}

public class DoubleLinkedListExercise {
    public static void main(String args[]){

        DoubleLinkedList dl = new DoubleLinkedList();

        dl.insert(4,"start",0);
        dl.insert(5,"end",0);
        dl.insert(7,"end",0);
        dl.insert(8,"end",0);
        dl.insert(1,"start",0);
        dl.insert(6," ",4);
        dl.delete(7);
        dl.delete(3);


    }

}

