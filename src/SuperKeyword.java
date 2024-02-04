class Teacher {
    private int id;
    private String name;

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        // Here, we are modifying static variable from non-static method.
        // Although it is ok, but better is to modify static variables from static method.
        System.out.println(id + " : " +name);
    }
}

class MathsTeacher extends Teacher{
    private String degree;

    public MathsTeacher(int id, String name, String degree){
        super(id,name);
        this.degree = degree;
    }

    public void show(){
        super.show();
        System.out.println("show from MathsTeacher class " + degree);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        MathsTeacher ashish = new MathsTeacher(101, "Ashish", "B.E.");
        ashish.show();
    }
}