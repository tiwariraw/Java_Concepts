import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println("id is: " + id + ", and name is: " + name);
    }
}

class ArrayOfObjects {
    public static void main(String[] args) {
        ArrayOfObjects.f1();
//        ArrayOfObjects.f2();
    }

    // using array
    public static void f1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees info you want to store? ");
        int noOfEmployee = sc.nextInt();

        Employee[] empArr = new Employee[noOfEmployee];

        for(int i=0;i<empArr.length;i++){
            System.out.println("Enter the id: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            Employee obj = new Employee(id,name);
            empArr[i] = obj;
        }

        for (Employee obj: empArr){
            obj.show();
        }
    }

    // using ArrayList
    public static void f2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees info you want to store? ");
        int noOfEmployee = sc.nextInt();

        ArrayList<Employee> empArr = new ArrayList<Employee>();

        for(int i=0;i<noOfEmployee;i++){
            System.out.println("Enter the id: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            Employee obj = new Employee(id,name);
            empArr.add(obj);
        }

        for (Employee obj: empArr){
            obj.show();
        }
    }
}
