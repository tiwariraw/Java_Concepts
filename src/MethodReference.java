import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface User {
    void login();
}

class MethodReference {
    // using anonymous inner class & lambda expression
  public void f1(){
      List<String> names = Arrays.asList("ashish", "sachin", "atul");

      // lambda expression
      names.forEach(name -> System.out.println(name));

      // instantiating Consumer interface using anonymous inner class
      // it has an 'accept' method which we need to override to provide our own implementation
      Consumer<String> con1 = new Consumer<String>() {
          @Override
          public void accept(String name) {
              System.out.println(name);
          }
      };
      names.forEach(con1);

      Consumer<String> con2 = name -> System.out.println(name);
      names.forEach(con2);

      // using method reference
      names.forEach(System.out::println);
  }

  // Reference to a static method (here, we are referring to pleasLogin static method)
  public static void pleasLogin(){
      System.out.println("please login...");
  }

  public void f2(){
      // we can refer to static method defined in the class
      // ContainingClass::staticMethodName

      User user1 = MethodReference::pleasLogin;
      user1.login();
  }

  // Reference to an instance method

  // instance method
  public void sayLogin(){
      System.out.println("saying logged in...");
  }
  public void f3(){
      // like static methods, we can refer instance methods also.
      // containingObject::instanceMethodName

      MethodReference m1 = new MethodReference();
      User user1 = m1::sayLogin;
      user1.login();
  }
}

/*
- javatpoint.com/java-8-method-reference
- Method reference is used to refer method of function interface.
*/