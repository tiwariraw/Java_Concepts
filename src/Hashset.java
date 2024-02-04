import java.util.HashSet;
class Hashset {
    public void f1(){
        HashSet<String> cities =new HashSet<String>();
        cities.add("varanasi");
        cities.add("delhi");
        cities.add("pune");

        System.out.println(cities); // [pune, varanasi, delhi]
        System.out.println(cities.size()); // 3

        System.out.println(cities.contains("varanasi")); // true

        // looping through elements
        for(String city: cities){
            System.out.println(city);
        }

        cities.remove("delhi");
        System.out.println(cities); // ["varanasi", "pune"]

        cities.clear(); // []
    }

    public void f2(){
        HashSet<Integer> uniqueId = new HashSet<Integer>();
    }
}

/*
- methods: add(), remove(), clear(), contains(), size()
- A HashSet is a collection of items where every item is unique, and it is found in the java.util package
- Items in a HashSet are actually objects. In the examples below, we created items (objects) of type "String".
  Remember that a String in Java is an object (not a primitive type).
  To use other types, such as init, you must specify an equivalent wrapper class: Integer.
*/