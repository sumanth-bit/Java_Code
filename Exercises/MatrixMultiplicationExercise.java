package Exercises;

/*
1. Here we are trying to execute the Matrix Multiplication using multiple threads Concept
Learnings
1. To pass parameters to the Run method we must declare class variable/attributes
2. Initialize them using a constructor
3. Here we are writing a normal inner class in which all Outer class attributes can be accessed but not main method varibales
4. We need to create an Outer class object and call the Inner class  otherwise you need to declare inner class as "static"
5. We can define function called in run in inner class or outer class(Both are fine but look at inside class implemention)
6. For result we can declare a class variable in Outer class so that it can  be used in outer class also and fill the results
7. After Every Thread in array you can use join() after the start() method

 */

public class MatrixMultiplicationExercise {
    public int[][] result;
    public static void main(String args[]){

        MatrixMultiplicationExercise a = new MatrixMultiplicationExercise();
        MatrixMultiplicationExercise b = new MatrixMultiplicationExercise();

        int arr[][] = {{12,8,4},{3,17,14},{9,8,10}};
        int arr1[][] = {{5,19,3},{6,15,9},{7,8,16}};
        System.out.println(arr.length);
        display(arr);
        display(arr1);


        if(arr[0].length != arr1.length){
            System.out.println("Multiplication cannot be performed");
            return;
        }
        System.out.println("Multiplication of array");
        a.result= new int[arr.length][arr[0].length];
        b.result= new int[arr.length][arr[0].length];
        Thread[] threads = new Thread[arr.length];
        for(int i = 0; i< arr.length; i++){
            threads[i] = new Thread(b.new RowMultiplication(i,arr[i].length,arr,arr1));
            threads[i].start();

            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        display(b.result);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***************");

    }
    public static void fillValues(int[][] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = 0;
                //System.out.print(arr[i][j]+" ");
            }

        }

    }

    class RowMultiplication implements Runnable{
        public int r;
        public int c;
        public int[][] arr3;
        public int[][] arr4;



        RowMultiplication(int r, int c,int[][] arr1,int[][] arr2){
            this.r = r;
            this.c = c;
            this.arr3 = arr1;
            this.arr4 = arr2;

        }

        public void run(){
            multiplyRow(r,c);

        }
        public void multiplyRow(int r, int c) {
            int[] k = new int[c];

            for (int j = 0; j < c; j++) {
                for (int l = 0; l < c; l++) {
                    result[r][j] = result[r][j] + (arr3[r][l] * arr4[l][j]);

                }

            }
            //display(result);

        }
//        public void display(int[][] k){
//            for(int[] i : k){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//
//        }

    }






}
