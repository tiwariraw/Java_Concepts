abstract class Car {
    public abstract void drive();

    public void play(){
        System.out.println("playing music...");
    }
}

class Audi extends Car {
    public void drive(){
        System.out.println("driving...");
    }
}

//class Main {
//    public static void main(String[] args){
//        Audi obj = new Audi();
//        obj.drive();
//        obj.play();
//    }
//}

/*
- https://www.programiz.com/java-programming/abstract-classes-methods
- An abstract class can have both the regular methods and abstract methods
- The abstract class in Java cannot be instantiated (we can create objects of abstract class).
  We use the "abstract" keyword to declare an abstract class.
- A method that doesn't have its body is known as an abstract method. We use the same "abstract" keyword
  to create abstract methods.
- If a class contains an abstract method, then the class should be declared abstract. Otherwise, it
  will generate an error.
- If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass
  must provide the implementation of the abstract method.
*/