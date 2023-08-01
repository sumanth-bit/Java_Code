package Exercises.DataStructures;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList{
    Node head;
    SingleLinkedList(){
        this.head = null;
    }

    public void insert(int ele, String pos,int p){
        Node new_node = new Node(ele);
        if(head == null){
            head = new_node;
        }
        else{
            if(pos == "start"){
                new_node.next = head;
                head = new_node;
            }
            else if(pos == "end"){
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_node;

            }
            else{
                Node temp = head;
                int count = 1;
                while(temp.next != null){
                    if(count + 1 == p){
                        new_node.next = temp.next;
                        temp.next = new_node;
                        break;
                    }
                    else{
                        count = count + 1;
                        temp = temp.next;
                    }

                }
            }

        }


    }

    public void delete(int node){
        Node temp = head;
        int count = 1;
        while(temp.next != null){
            if(count + 1 == node){
                temp.next = temp.next.next;
                break;
            }
            else{
                if(temp.next == null){
                    System.out.println("You have reached end, please insert other position");
                }
                else {
                    count = count + 1;
                    temp = temp.next;
                }
            }

        }

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class LinkedListClassExercise {
    public static void main(String args[]){
        SingleLinkedList l1 = new SingleLinkedList();
        l1.insert(23,"start",0);
        l1.insert(34,"start",0);
        l1.insert(45,"end",0);
        l1.insert(55,"end",0);
        l1.insert(66," ",2);
        l1.insert(66," ",4);

        l1.display();
        l1.delete(4);
        l1.display();
    }


}
