package Exercises;
import java.util.*;
import java.util.stream.IntStream;

public class MergeSortMultiThreadExercise extends Thread{
    public static int[] arr;
    int lb;
    int ub;

    public MergeSortMultiThreadExercise(int lb,int ub)
    {
        this.lb = lb;
        this.ub = ub;

    }



    public static void main(String arg[]){


        Scanner sc = new Scanner(System.in);
        MergeSortMultiThreadExercise.arr = new int[20];
        int numberOfThreads = 4;
        int sizeofArray = 20;
        for(int k = 0; k< 20; k++){
            MergeSortMultiThreadExercise.arr[k] = (int) (Math.random() * 20);
        }
        System.out.println(arr.length);
        //System.out.println(arr);
        display(0,20);
        System.out.println();
        //MergeSortMultiThreadExercise obj = new MergeSortMultiThreadExercise();

        MergeSortMultiThreadExercise[] threads = new MergeSortMultiThreadExercise[4];
        int division = sizeofArray/numberOfThreads;

        for(int i = 0; i< 4; i++){

            int startIndex = i * division;
            int endIndex = startIndex + division - 1;
            threads[i] = new MergeSortMultiThreadExercise(startIndex,endIndex);
            threads[i].start();

        }

        for(MergeSortMultiThreadExercise thread: threads){
            try{
                thread.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }



        for (int i = 0; i < numberOfThreads; i++) {
            int startIndex = i * division;
            int endIndex = startIndex + division - 1;
            display(startIndex,endIndex);

        }
        Thread t1 = new MergeSortMultiThreadExercise(0,sizeofArray - 1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final output");
        display(0,sizeofArray);


//
//        mergeSort(0,arr.length - 1);
//        for(int ele : arr) {
//            System.out.print(ele+",");
//        }
    }
    public void mergeSort(int lb,int ub){
        if(lb<ub){
            int m = (lb + ub)/2;
            mergeSort(lb,m);
            mergeSort(m + 1,ub);
            merge(lb,m,ub);
        }

    }
    public void merge(int l, int m ,int u){
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] sortarr = new int[u - l + 1];

        while(i <= m && j <= u){
            if(arr[i] <= arr[j]){
                sortarr[k] = arr[i];
                i = i + 1;
                k = k + 1;
            }
            else{
                sortarr[k] = arr[j];
                j = j + 1;
                k = k + 1;
            }
        }

        while(i <= m){
            sortarr[k] = arr[i];
            i = i + 1;
            k = k + 1;

        }
        while(j <= u){
            sortarr[k] = arr[j];
            j = j + 1;
            k = k + 1;
        }
        k = 0;
        for(i = l; i <= u; i++){
            arr[i] = sortarr[k];
            k = k + 1;
        }

    }

    public void run(){
        System.out.println("Inside Thread "+Thread.currentThread().getName()+" l = "+lb+" u = "+ub);
        mergeSort(lb ,ub);
    }

    public static void display(int l, int u){
        for(int i = l; i< u ; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();

    }



    public void swap(int arr[], int i , int j){
        int k;
        k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

}
