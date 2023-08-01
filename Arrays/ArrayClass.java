package Arrays;

public class ArrayClass {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 45, 6, 7, 8};
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
        float arr1[][] = new float[3][4]; // declaration multi dimentional array with size
        double arr2[][] = {{2.333d,45.7777d},{7.8888d,900.666d}}; // declaring mutli dimensional array without size


        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i =0;i<arr2.length;i++){
            for (int j = 0 ;j< arr2.length;j++){
                System.out.print(arr2[i][j] +" ");

            }
            System.out.println();
            }


        // Call by reference only works for the object type parameter, not works for primitive data types
        // Call by value works for only non-primitive data types
        change(arr);

        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();

        String s = "Sumanth";
        System.out.println(s);
        changeString(s);
        System.out.println(s);


        }

        public static void change(int arr[]){
        arr[0] = 123;
        return;
        }
    public static void changeString(String s){
        s = "Komali";
        return;
    }

    }

