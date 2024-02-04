final class FinalKeyword {
    final int NUM = 10; // instance variable made constant with "final" keyword

    public static void main(String[] args) {
        final int AGE = 12; // local variable made constant with "final" keyword
        // AGE = 18; // Error

        FinalKeyword obj = new FinalKeyword();
        // obj.NUM = 100; // Error: Cannot assign a value to final variable 'num'

    }

    public final void methodMadeFinal(){
        System.out.println("This public non-static method is made final");
    }
}

//class Child extends FinalKeyword{
//    @Override
//    public void methodMadeFinal(){
//        System.out.println("Error because of method made final in the parent class");
//    }
//}

/*
- The "final" keyword is a non-access modifier used for variables,
  methods, and classes which makes them non-changeable (impossible to inherit or override)
  OR
  The "final" keyword is used to denote constants.

- Once an entity (variable, method or class) is declared "final", it can be assigned
  only once:
    - the final variable can't be reinitialized with another value
    - the final method cannot be overridden
    - the final class can't be extended
*/
