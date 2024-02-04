import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling.f1();
        ExceptionHandling.f2();
    }

    public static void f1(){
        try {
            int[] nums = {1,3,5,7,9};
            System.out.println(nums[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("This block will be executed always.");
        }

        System.out.println("line after try-catch");
    }

    public static void f2(){
        int age = 10;
        try {
            if(age < 18) {
                throw new ArithmeticException("Not eligible");
            }else {
                System.out.println("Eligible");
            }
        }catch(ArithmeticException e){
            System.out.println("exception handled: " + e);
        }

        System.out.println("line after try-catch");
    }

    public static void f3() throws IOException {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("README.txt"));
            // ...
        }catch(IOException e){
            // handling code
        }finally {
            if(br != null){
                br.close();
            }
        }

        // here we are explicitly closing the resource in finally block
    }

    // try with resources
    public static void f4(){
        try(BufferedReader br = new BufferedReader(new FileReader("README.txt")) ){
            // ...
        }catch (IOException e){
            // handling code
        }
    }

    // Here, the resource will be closed automatically, we don't have to close
    // it explicitly in finally block
}

/*
- https://www.w3schools.com/java/java_try_catch.asp
- https://www.programiz.com/java-programming/try-with-resources
- https://www.geeksforgeeks.org/exceptions-in-java/

- The try-with-resources statement automatically closes all the resources at
  the end of the statement. A resource is an object to be closed at the end
  of the program.
-
*/
