//class Main {
//
//    public static void main(String[] args) {
//        FunctionOverloading obj = new FunctionOverloading();
//        System.out.println(obj.add());
//        System.out.println(obj.add(2));
//        System.out.println(obj.add(2,3));
//        System.out.println(obj.add(2,3,5));
//    }
//}
class FunctionOverloading {
    public int add(){
        return 0;
    }

    public int add(int a){
        return a;
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}

/* Method Overloading:
- If a class has multiple methods having same name but different number
of parameters.

- have same number of parameters but of different type.

- if number and type of parameters are same, and you change only the return
type, then that is not method overloading.

- https://www.javatpoint.com/method-overloading-in-java
*/