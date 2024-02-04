1. Installation
    jdk download (oracle)

2. jdk has JRE, and JRE has JVM.
jav code ---> COMPILER(javac) ---> bytecode (.class file) ---> JVM

3. Running a java file:
   javac filename
   java classname

4. Data types:

   # Primitive Types:
        Integer: int (4 bytes), byte (1 byte), short (2 bytes), long (8 bytes, long num = 7.56l;)
        Decimal: float (4 bytes, float num = 5.43f;), double (8 bytes, it is default for decimal numbers in Java)
        Boolean: boolean (1 bit)
        Character: char(2 bytes)

   # Non-primitive types:
        String, Arrays, Classes, etc.

5. Type conversion and type casting:
    eg1.
        byte b = 127;
        int a = 257;
        b = (byte) a; // 257 % 256(range of byte)

     eg2.
        float num1 = 5.46f;
        int num2 = 185;
        num2 = (int) num1;

6.
    A.
        int num = 0b101; // binary
        int num = 0x101; // hex
        int num = 10_00_000;

    B.
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        float f1 = Float.MAX_VALUE;
        long l1 = Long.MAX_VALUE;
        double d1 = Double.MAX_VALUE;

    C.
        5 / 3 => gives 1 i.e. / is not a true division operator

    D.
        int[] nums = {1,3,5,7,9};
        System.out.println(nums.getClass());

7. Array
    eg1.
        int[] nums = {1,3,5,7,9};

        // for loop
        for(int i=0;i< nums.length;i++){
             System.out.println(nums[i]);
        }

        // for each loop
        for(int num: nums){
             System.out.println(num);
        }

    eg2.
        String[] names = {"ashish", "sachin", "atul"};

        - A functional interface is an interface that contains only one abstract method.
          But they can include any quantity of default and static methods.
        - Runnable, ActionListener, and Comparable are some of the examples of functional interface.
        */

8.
- JDK has JRE, and JRE has JVM.
- JRE contains JVM as well as extra files (java pre-written libraries (collection of classes and interfaces))
- JDK = JRE + Development tools (javac, java, etc.)
      = JVM + Library classes + Development tools
- Ref:
    - https://www.youtube.com/watch?v=eaAqwTdUAAo
    - https://www.javatpoint.com/difference-between-jdk-jre-and-jvm

9. Car c1 = new Car();
- "new" operator is used to create an instance of the class.
In other words, it instantiates a class by allocating memory for a new
object and returning a reference to that memory.

- c1 is a reference variable that stores the reference/memory address of the
newly created object.

10.
- JVM has stack and a heap.
    - local variables of a method & methods parameters are created in stack
    - object or aka reference variables are created inside Heap.
      The instance variables (fields/properties of a class) is created in Heap.

- Ref:
    - https://www.javatpoint.com/stack-vs-heap-java
    - https://www.baeldung.com/java-stack-heap

11. Can we overload main() method?
- Yes, we can have any number of main methods in a class by method overloading
but JVM calls main() method which receives string array as arguments only.
- https://www.javatpoint.com/method-overloading-in-java

12. System.out.print() vs System.out.println()
- System.out.print() and System.out.println() are both methods in Java used
  for printing output to the console, but they behave differently regarding
  the cursor position after printing.

- System.out.print()
    - Prints the specified data to the console without moving the cursor to the next line.
    - Subsequent output will be on the same line as the last character of the printed data.

- System.out.println()
    - Prints the specified data to the console and moves the cursor to the next line.
    - Subsequent output will be on a new line.

13. Generating random numbers in java
- In Java, Math.random() is a method that generates a pseudorandom double value
  between 0.0 (inclusive) and 1.0 (exclusive).

- public class RandomExample {
      public static void main(String[] args) {
          // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
          double randomValue = Math.random();

          System.out.println("Random value: " + randomValue);

          // Generate a random integer between 1 and 10 (inclusive)
          int randomInt = (int) (Math.random() * 10) + 1;

          System.out.println("Random integer between 1 and 10: " + randomInt);
      }
  }

- Math.random() is used to generate a random double between 0.0 and 1.0.
  Math.random() * 10 scales the value to be between 0.0 and 10.0.
  (int) is used to cast the result to an integer, truncating the decimal part and leaving an integer between 0 and 9.
  Finally, + 1 is added to ensure that the generated integer is between 1 and 10 (inclusive).

- Explore "Random" class in Java for better handling random numbers.

14.
compareTo() -> it is a part of the Comparable interface and implemented by the String class
    - https://www.programiz.com/java-programming/library/string/compareto

Comparable interface of Java
    - https://www.javatpoint.com/Comparable-interface-in-collection-framework

15. In a class, if you don't assign value to:
    - an instance variable of type int, its default value will be 0
    - an instance variable of type String, its default value will be null (because string is an object)
    - an instance variable of type float/double, its default value will be 0.0
    - an instance variable of type boolean, its default value will be false

16. isPresent() method used to check null on an optional variable in Java8

17.