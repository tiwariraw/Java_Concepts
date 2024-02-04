// Strings are immutable

class StringDemo {
    public static void main(String[] args) {
        StringDemo.f2();
    }

    public static void f1(){
        String name = "ashish";
        System.out.println(name.hashCode()); // returns the hashcode
        System.out.println(name.charAt(0));
        name.concat(" tiwari");

        // s1 and s2 are storing the same reference of the "Navin" string
        // object (here, only 1 object is created in Heap memory) and s1 & s2 are
        // reference variables created in heap whose references pointed to the
        // string object created in heap.
        // In heap, there is a "String constant pool" (4:42:00 to 4:48:00, Telusko java)
        String s1 = "Sachin";
        String s2 = "Sachin";
        System.out.println(s1 == s2); // true

        // If we assign a different value, say "Atul" to s2, then
        s2 = "Atul";
        System.out.println(s1);
        System.out.println(s2);

    }

    // StringBuffer & StringBuilder (they both provide a way to create mutable strings)
    // StringBuffer is thread safe while StringBuilder is not
    public static void f2(){
        StringBuffer sb = new StringBuffer();
        sb.append("ashish");

        System.out.println(sb); // ashish tiwari
        System.out.println(sb.length()); // 6
        System.out.println(sb.capacity()); // 16 (returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2)

        // stringbuffer to string conversion
        String str1 = sb.toString();
        System.out.println(str1); // ashish tiwari

        sb.insert(0, "sri "); // sri ashish
        sb.replace(0,3, "Ram"); // Ram ashish (beginIndex to endIndex-1)
        sb.delete(0,5); // shish (beginIndex to endIndex-1)
        sb.reverse(); // shihs
    }
}

/*
- String name = "ashish";
or String name = new String("ashish");

- methods
hashCode(), charAt(index), concat(),

- String objects are fixed-length & immutable.
- StringBuffer is mutable and thread-safe, which means multiple threads can
  access it simultaneously.
- StringBuilder is mutable but is not thread-safe.

- StringBuffer class:
    - Constructors:
        - StringBuffer(): creates an empty string buffer with an initial capacity of 16. It reserves room for 16 characters without reallocation.
        - StringBuffer(String str): creates a string buffer with the specified string. It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
        - StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length. It accepts an integer argument that explicitly sets the size of the buffer.

     - methods:
        - capacity() , length(), append(), insert(), replace(), delete(), reverse()
        - ensureCapacity(), newLength()
        - charAt(), deleteCharAt(), substring()

     - default capacity is 16 meaning room is reserved for 16 characters without reallocation

     - https://www.geeksforgeeks.org/stringbuffer-class-in-java/

- StringBuilder class:
    - It is not thread safe. It is high in performance compared to StringBuffer.

    - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
*/