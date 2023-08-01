package Exercises;
import java.util.*;
import java.util.stream.*;

public class ArrayExercisesClass2 {

    public static void main(String args[]){

        int[] arr = {-1, 4, 0, 2, 7, -3};
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        int i = 0,j = 0;
        for(i =0; i<arr.length;i++){
            if(arr[i] < min){
                second_min = min;
                min = arr[i];
            }
            else{
                if(second_min > arr[i]){
                    second_min = arr[i];
                }
            }

        }
        System.out.println("Second Minimum value is "+second_min);

        //19. Write a Java program to add two matrices of the same size.
        int[][] mat1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2={{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat3=new int[mat1.length][mat1[0].length];
        //int i,j;

        for(i = 0; i< mat1.length; i++){
            for(j = 0; j< mat1[0].length;j++){
                mat3[i][j] = mat1[i][j] +mat2[i][j];
            }
        }
        Arrays.stream(mat3).map((a)->Arrays.stream(a)).forEach(ele->{
            System.out.println();
            ele.forEach(el->System.out.print(el+" "));

        });
        //20. Write a Java program to convert an array to an ArrayList.
        System.out.println();

        List<Integer> a = new ArrayList<>();
        Arrays.stream(arr).forEach(a::add);
        System.out.println(a);

        //21. Write a Java program to convert an ArrayList to an array.

        Integer arr2[] = new Integer[a.size()];
        //this will convert list to an array a.toArray(arr2)-->this arr2 has be declared already
        a.toArray(arr2);

        //print array list

        a.stream().mapToInt((ele)->ele).forEach(ele->System.out.println(ele));

        /*
        1. Arrays.stream(arr) create an IntStream object which consists of all elements in the stream
        2. Where as Stream.of(arr) return a Stream object which treats array as an whole object
        3. We need to use flatMapToInt(Arrays::stream) method to divide into elements inorder to print.
         */



    }

}
