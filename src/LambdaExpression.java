import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.function.Consumer;

@FunctionalInterface
interface CalcSum {
    int sum(int a, int b);
}

@FunctionalInterface
interface MyComparator {
    boolean compare(int a1, int a2);
}

class Person1 {
    int age;
    String name;

    public Person1(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
}

class LambdaExpression {
    public static void main(String[] args) {
        LambdaExpression.f1();
    }

    public static void f1() {
        // using forEach on ArrayList and passing lambda expression
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(15);

        // The lambda expression is the operation that gets applied to each element
        nums.forEach(num -> System.out.println(num));
    }

    // 'forEach' on an array
    public static void f2() {
        // 'forEach' isn't limited to collections; it can also be used on
        // streams, arrays, and other types that implements 'Iterable' interface.

        // In this example, forEach is applied to an 'IntStream' created from
        // an array of integers.

        int[] nums = {2, 4, 6, 8, 10};
        Arrays.stream(nums).forEach(num -> System.out.println(num));
    }

    // storing lambda expression in a variable
    public static void f3() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ashish");
        names.add("atul");
        names.add("sachin");

        Consumer<String> method = name -> System.out.println(name);
        names.forEach(method);
    }

    // calculating sum of 2 nos using lambda expression
    public static void f4() {
        // using anonymous inner class
        CalcSum c1 = new CalcSum() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        c1.sum(2, 4);

        // using lambda expression
        CalcSum c2 = (int a, int b) -> a + b;
        System.out.println(c2.sum(3, 5));
    }

    // comparator (when we want to sort a collection of items that can be compared, we use a comparator)
    public static void f5() {
        List<Person1> list = new ArrayList<Person1>();
        list.add(new Person1(18, "Ashish"));
        list.add(new Person1(20, "Sachin"));
        list.add(new Person1(22, "Gau"));

        // sorting on the basis of the name of the person
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for (Person1 p : list) {
            System.out.println(p.name + " " + p.age);
        }
    }

    // filter collection data (Java is equipped with filter() method inside the stream class and we can use Lambda expression in java to provide the condition to the filter)
    public static void f6() {

    }

    public static void f7() {
        // A lambda expression in Java is an object. A lambda expression can be assigned to a variable and passed around like any other object
        MyComparator myComparator = (a1, a2) -> a1 > a2;

        boolean result = myComparator.compare(2, 5);
        System.out.println(result); // false
    }
}

/*
- Lambda expression in java is an anonymous (no name) function that does not
  need to define the data type of input parameters and does not need to have
  a return type. Lambda expression in java implements the functional interface
  , and it can be treated as any other java object.

- A lambda expression is a short block of code which takes in parameters and
  returns a value. Lambda expressions are similar to methods, but they do not
  need a name, and they can be implemented right in the body of a method.

- The simplest lambda expression contains a single parameter and an expression:
    parameter -> expression

- To use more than one parameter, wrap them in parentheses:
    (parameter1, parameter2) -> expression

- https://www.scaler.com/topics/java/lambda-expression-in-java/
*/

/*
- In Java, 'forEach' is a method introduced in Java 8 as part of the Stream API.
It is used for iterating over elements of a collection or elements of a stream
and applying a specified operation to each element.

- The 'forEach' takes a single parameter which is a functional interface
representing the operation to be performed on each element.
*/