import java.util.Arrays;
import java.util.Scanner;

class Array {
    public static void main(String[] args){
//        Array.f1();
        Array.f2();
    }


    // 1D array
    public static void f1(){
        // int[] nums = {1,3,5,7,9};
        int[] nums = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            System.out.println("Enter the " + (i+1) + " element: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("--------------------");

        for(int e:nums){
            System.out.println(e);
        }
    }

    // 2D array
    public static void f2(){
        Scanner sc = new Scanner(System.in);
        int[][] nums = {{1,3,5}, {2,4,6}}; // <==> int nums[2][2]
//        int [][] nums = new int[3][4]; // 3 rows, 4 columns

        // printing 2d array M1
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.println(nums[i][j]);
            }
        }

        // taking input & printing 2d array if the elements are dynamic
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter the " + i + " row " + j + " element");
                int el = sc.nextInt();
                numbers[i][j] = el;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------");

        // printing using enhanced for loop
        for(int[] arr: numbers){
            for(int e: arr){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    // jagged array
    public static void f3(){
        int[][] nums = new int[3][];

        // for each row, creating an array of varied length
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int[] arr: nums){
            for(int e: arr){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

/*
1. size of array is fixed and has to be determined at compile time.
- if you don't know the exact values to store, create an array using:
    int[] nums = new int[5];
- Then either take the values from user or manually assign:
    nums[0] = 3; nums[1] = 6; nums[2] = 9; nums[3] = 12; nums[4] = 15;

2. int[] nums = {1,3,5,7,9};
   nums[1] = 33;
   System.out.println(nums[1]);

3. Taking input from user:

    int[] nums = new int[5]; // by defult, all the values will be 0
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<nums.length;i++){
       System.out.println("Enter the " + (i+1) + " element: ");
       nums[i] = sc.nextInt();
     }

4. jagged array
    - https://www.geeksforgeeks.org/jagged-array-in-java/
    - A jagged array is an array of arrays such that member arrays can be
      of different sizes, i.e., we can create a 2-D array but with a variable
      number of columns in each row.
*/