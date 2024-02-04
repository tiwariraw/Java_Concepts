class Test {
    String name;
    static int count; // static variable

    public Test(String name){
        this.name = name;
        System.out.println("constructor called");
    }

    // static block is used to initialize the static variables
    // this block will be called only once and not every time when the object is created
    // static block is called first even before the constructor
    static {
        count = 0;
        System.out.println("In static block");
    }

    // static method
    public void incrementCount(){
        count++;
    }

    public void show(){
        System.out.println(count);
    }

    // we can't access non-static variable inside a static method directly.
    // But it can be done if the object of this class is passed as an argument
    // to the below static method
    public static void f1(Test obj){
        // System.out.println(name + count); // error while accessing instance variable "name"
        System.out.println(obj.name + count);
    }
}

class StaticKeyword {

    public static void main(String[] args) {
        Test t1 = new Test("Ashish");
        Test t2 = new Test("Sachin");

        t1.incrementCount();

        t1.show(); // 1
        t2.show(); // 1

        Test.f1(t1);
    }
}

/*
-  static variables are accessed on class itself. They can be accessed without the need to create an instance of the class.

- static variables are shared among the instances.
    - i.e. all the objects will refer to same static variable as opposed to instance
      variables. Each object has its own copy of the instance variable.

- Static variables and methods are allocated memory space only once during the execution of the program.

- In non-static method, we can access static variables.
  But in static method, we can't access instance variables.

- Static members are associated with the class, not with individual objects.
  This means that changes to a static member are reflected in all instances
  of the class.

- Static methods and variables cannot access non-static members of a class,
  as they are not associated with any particular instance of the class.

- Static methods can be overloaded, which means that you can define multiple
  methods with the same name but different parameters. However, they cannot
  be overridden, as they are associated with the class rather than with a
  particular instance of the class.

- Static methods restrictions:
    - They can only directly call other static methods.
    - They can only directly access static data.
      i.e. from a static method, we can't access instance variables or non-static/regular methods
    - They cannot refer to this or super in any way.

Static class:
    - A class can be made static only if it is a nested class.
    - We cannot declare a top-level class with a static modifier but can declare
      nested classes as static. Such types of classes are called Nested static
      classes.
    - Nested static class doesn't need a reference of Outer class.
      In this case, a static class cannot access non-static
      members of the Outer class.

    - class Main {
        private static String name = "Ashish Tiwari";

        static class NestedClass {
            public void show(){
                System.out.println(name);
            }
         }

        public static void main(String[] args) {
            Main.NestedClass obj = new Main.NestedClass();
            obj.show();
        }
    }

- Class.forName(String nameOfTheClassToLoadWithoutCreatingItsObject);
    - eg. Class.forName("Person"); (5:05:00 - 6:00, Telusko java)
    - Also read about class loader in java

- https://www.geeksforgeeks.org/static-keyword-java/
*/
