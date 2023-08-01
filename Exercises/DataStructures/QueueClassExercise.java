package Exercises.DataStructures;

class Queues{
    public int arr[];
    public int head;
    public int tail;
    public int size;

    Queues(int size){
        this.size = size;
        arr = new int[size];
        head = 0;
        tail = 0;
    }

    public void insert(int ele){

        if(tail > size){
            System.out.println("You have Exceeded the size");
            return;
        }
        else{
            arr[tail] = ele;
            tail = tail + 1;
        }
        System.out.println("Element has been inserted "+ele);
        display();

    }
    public void delete(){
        if(arr.length == 0){
            System.out.println("You do not have elements in the queues");
            return;
        }
        System.out.println("Element has been deleted "+arr[head]);
        head = head + 1;
        size = size - 1;

        display();
    }

    public void display(){
        for(int i = head; i < tail; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void search(int x){
        int l = 0;
        int h = arr.length;
        int m = 0;
        int[] dupli = arr;
        mergeSort(dupli,0,dupli.length - 1);
        for(int i = 0; i<dupli.length; i++){
            System.out.print(arr[i]+" ");
        }

        while(l<=h){
            m = (l+h)/2;
            if(x > dupli[m]){
                l = m +1;
            }
            else if(x < dupli[m]){
                h = m - 1;
            }
            else{
                System.out.println("Element is found at "+(m+1));
                return;
            }
        }
        System.out.println("Didn't find the element");


    }
    public void mergeSort(int[] arr,int l, int h){
        if(l<h){
            int m = (l+h)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);
            merge(arr,l,m,h);
        }
    }
    public void merge(int arr[],int l , int m , int h){
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] sort = new int[h- l + 1];

        while(i<=m && j<=h){
            if(arr[i] >= arr[j]){
                sort[k++] = arr[j++];
            }
            else{
                sort[k++] = arr[i++];

            }
        }

        while(i <= m){
            sort[k++] = arr[i++];
        }
        while(j<= h){
            sort[k++] = arr[j++];
        }
        k = 0;

        for(int index = l; index<= h; index++){
            arr[index] = sort[k++];

        }
    }





}

public class QueueClassExercise {
    public static void main(String args[]){

        Queues q = new Queues(7);
        q.insert(1);
        q.insert(3);
        q.insert(2);
        q.insert(26);
        q.insert(23);
        q.insert(20);
        q.insert(0);
        q.search(20);



    }
}
