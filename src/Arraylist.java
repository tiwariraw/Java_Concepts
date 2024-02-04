import java.util.ArrayList;
import java.util.Collections;
class Arraylist {
    public void f1(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(15);

        System.out.println(nums); // [5,10,15]
        System.out.println(nums.size()); // 3

        // looping through elements of ArrayList
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int num: nums){
            System.out.println(num);
        }

        nums.forEach(num -> System.out.println(num));

        // sorting an ArrayList (another useful class in the java.util package is the Collections class, which include
        // sort() method for sorting lists alphabetically or numerically)

        Collections.sort(nums);
        System.out.println(nums);

        // to access an element in the ArrayList, use the get() method and refer to the index number
        System.out.println(nums.get(1)); // 10

        // to modify an element, use the set() method and refer to the index number
        nums.set(0,101);
        System.out.println(nums); // [101, 10, 15]

        // to remove an element, use the remove() method and refer to the index number
        nums.remove(0);
        System.out.println(nums); // [10, 15]
        nums.clear();
        System.out.println(nums); // []

        // ArrayList of string
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("varanasi");
    }
}

/*
- methods: add(), get(), set(), remove(), clear(), size()
- The ArrayList class is a resizable array, which can be found in the java.util package
- The difference between a built-in array and an ArrayList is that the size of an array
  cannot be modified (if you want to add/remove elements to/from an array, you have to
  create a new one). While elements can be added and removed from an ArrayList whenever
  you want.
*/