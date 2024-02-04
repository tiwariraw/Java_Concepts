@FunctionalInterface
interface Person {
    // public abstract void show();
    void show(String name);
}

@FunctionalInterface
interface LengthInter {
    int getLength(String str);
}

class Male implements Person {
    public void show(String name){
        System.out.println(name + "showing...");
    }
}

class FuncInter {
    public static void main(String[] args) {
        FuncInter obj = new FuncInter();
        obj.f1();
        obj.f2();
    }

    public void f1(){
        // creating an object of a class that implements the function interface
        Male m1 = new Male();
        m1.show("Ashish");

        // or we can use anonymous inner class
        Person p1 = new Person() {
            @Override
            public void show(String name) {
                System.out.println(name + "showing again...");
            }
        };

        p1.show("Ashish");

        // or we can use lambda expression instead of anonymous inner class

        Person p2 = (String name) -> System.out.println("Showing" + name);
        p2.show("Ashish");
    }

    public void f2(){
        LengthInter obj = (str) -> str.length();
        System.out.println(obj.getLength("Ashish"));
    }
}

// Some in-built functional interfaces are: Runnable, Callable, ActionListener
// https://www.youtube.com/watch?v=tCwg16PUZyo (Durgesh)