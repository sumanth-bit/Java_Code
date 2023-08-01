package Exercises;
import java.io.*;
import java.util.*;

public class NumbersClassExercise {

    public static void main(String args[]){
        //1. Write a Java program to check whether a given number is ugly.
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= (k/2); i++){
            if(k%i == 0){
                System.out.println(i);
                if((i != 2 && i != 3 && i != 5) && isPrime(i)) {
                    System.out.println("Inside "+i);
                    System.out.println("It's not ugly number");
                    return;
                }

            }
        }
        System.out.println("It is an ugly number ");
    }
    public static boolean  isPrime(int i){
        int count = 2;
        for(int j = 2; j<= (i/2); j++){
            if(i % j == 0){
                count = count + 1;
                if(count > 2){
                    return false;
                }
            }
        }
        return true;
    }

}
