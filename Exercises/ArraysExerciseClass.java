package Exercises;
import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.stream.*;

public class ArraysExerciseClass {

    public static void main(String args[]){

        int arr[] = {12,145,15,19,18};
        display(arr);
        //System.out.println(arr);]
        //We cannot use streams because they are not objects but primitive data types.
        //Stream.of(arr).map(i->Integer.valueOf(i)).forEach(System.out::println);
        //Stream.of(arr).forEach((i)->System.out.print(i+" "));
        System.out.println();

        mergeSort(arr,0,arr.length - 1);
        //Stream.of(arr).forEach((i)->System.out.print(i+" "));
        display(arr);
        System.out.println();


        // 1. Write a Java program to sort a numeric array and a string array.

        //for numeric array you need to convert it into String i.e. Arrays.toString(arr) and then call sort method()
        String arr2[] = {"Java", "Python","AWS","NVMe","Python"};
        Arrays.sort(arr2);
        for(String s:arr2) {
            System.out.print(s+" ");
        }

        //2. Write a Java program to sum values of an array.
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
           sum = sum +arr[i];
        }
        System.out.println(sum);

        //3. Write a Java program to print the following grid.

        for(int i = 0; i<4; i++){
            for(int j = 0; j< 4; j++){
                System.out.print("- ");
            }
            System.out.println();
        }

        //4. Write a Java program to calculate the average value of array elements.

        System.out.println("Average is "+sum/arr.length);

        //5. Write a Java program to test if an array contains a specific value.
        int ele = 19;

        //6. Write a Java program to find the index of an array element.

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 19){
                System.out.println("position is "+ (i+1));
                break;
            }
        }
        //7. Write a Java program to remove a specific element from an array.
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 19){
                arr[i] = 0;
            }
        }
        display(arr);

        // if index is given as remove 3rd element
        int index = 3;
        //we cannot alter or dynamically change the array size, we might see duplicates


        for(int i = 3;i < arr.length - 1;i++){
            arr[i] = arr[i+1];
        }
        display(arr);
        //we can copy either by iterating or directly assigning
        int copy[] = arr;
        display(copy);

        //9. Write a Java program to insert an element (specific position) into an array.

        int pos = 3;
        arr[pos] =153;
        display(arr);

        for(int i = 0; i < pos ; i++){
            arr[i] = arr[i+1];
        }
        arr[pos] =174;
        display(arr);

        for(int i = 0; i<=index;i++){
            arr[i] = arr[i+1];
        }
        display(arr);
        //10. Write a Java program to find the maximum and minimum value of an array.
        int maxStreams = Arrays.stream(arr).reduce(Integer::max).getAsInt();
        int minStreams = Arrays.stream(arr).reduce(Integer::min).getAsInt();

        int min =  arr[0];
        int max  =  arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println(max+"  "+min);

        //11. Write a Java program to reverse an array of integer values.
        int l = 0, k = 0;
        int h = arr.length - 1;
        while(l<h){
            k = arr[l];
            arr[l] = arr[h];
            arr[h] = k;
            l = l + 1;
            h = h - 1;
        }
        display(arr);

        int i = 0;

        //13. Write a Java program to find duplicate values in an array of string values
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        //auto boxing happens here as well
        for(i = 0;i<arr.length; i++){
            if(! map.containsKey(arr2[i])) {
                map.put(arr2[i], 1);
            }
            else {
                System.out.println(arr2[i] +" is duplicate");
            }

            }

        //14. Write a Java program to find common elements between two arrays (string values).
        //15. Write a Java program to find common elements between two integer arrays.
        String strArray[] = {"Golang","C","C++","C#","Python"};

        for(i = 0; i< arr.length; i++){
            for(int j = 0; j< strArray.length; j++) {
                if(arr2[i].equals(strArray[j])){
                    System.out.println("We have some common item "+arr2[i]);
                }

            }
        }
        LinkedHashMap<String, Integer> l2 = new LinkedHashMap<>();
        Arrays.stream(arr2).forEach((elem)->l2.put(elem,1));
        System.out.println(l2);
        Arrays.stream(strArray).filter((elem)->l2.containsKey(elem)).forEach((System.out::println));

        //16. Write a Java program to remove duplicate elements from an array.

        HashSet<String> h1 = new HashSet<>();
        Arrays.stream(arr2).forEach(h1::add);
        String result[] = new String[h1.size()];
        System.out.println(h1.toArray(result));

        //Arrays.stream(arr).max((se1,se2)->se1.compareTo(se2)).skip(1).get();
        Integer l9[] = {1,3,5,7,9,20};

        // Here you are getting  Stream.of(arr).map(arr[]) because it contains a stream of objects i.e Integer,Float,Double
        // And array is also considered to be an object and taking complete array as an object
        //Map usually returns a Stream or input stream after performing the Operation in provieded as argument

        int second_max = Arrays.stream(Stream.of(arr).toArray(Integer[]::new)).max((se1,se2)->se1.compareTo(se2)).stream().skip(1).findFirst().get();

        System.out.println(second_max);

        //17. Write a Java program to find the second largest element in an array.

        mergeSort(arr,0,l9.length - 1);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[1]);

















        }





    public static void mergeSort(int[] arr,int l, int h){
        if(l<h){
            int m = (l+h)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);
            merge(arr,l,m,h);
        }
    }
    public static void merge(int arr[], int l, int m ,int h){
        int i = l;
        int j = m + 1;
        int k = 0;
        int sorted_array[] = new int[h-l+1];
        while(i <= m && j <= h){
            if(arr[i] <= arr[j]){
                sorted_array[k++] = arr[i++];
            }
            else{
                sorted_array[k++] = arr[j++];
            }
        }

        while(i <= m){
            sorted_array[k++] = arr[i++];
        }
        while(j<= h){
            sorted_array[k++] = arr[j++];
        }
        k = 0;
        for(int x = l;x <= h; x++){
            arr[x] = sorted_array[k++];
        }
    }
    public static void display(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
