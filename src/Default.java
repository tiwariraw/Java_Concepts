// "default" keyword

interface Human {
    default void walk(){
        System.out.println("default walking...");
    }
}
class Default implements Human {
    @Override
    public void walk(){
        System.out.println("overridden walking...");
    }
}

//class Main {
//    public static void main(){
//        Default obj = new Default();
//        obj.walk();
//    }
//}

/*
- The "default" class is created when you do not explicitly specify a class modifier like public,
  protected, or private in your class declaration. The default class access level is package private,
  meaning the class can be accessed only within the same package in which it is declared.

- used in switch statements

- "default" keyword is used in the context of interfaces in Java.
  It defines a default implementation of a method in an interface.
  This allows the interface to provide a default implementation for a method, which can be overridden
  by implementing classes if needed.
*/

/*
- In this statement, the interface defines a default method called walk().
- The Default class implements the Human interface and inherits the default implementation
  of walk(). The walk() method is called on an instance of the Default class in the main() method,
  which prints "default walking...". If the Default class overrides the walk() method, it will use
  the overridden implementation instead of the default implementation and print "overridden walking..."
*/