import java.util.HashMap;
class Hashmap {
    public void f1(){
        HashMap<String, String> user = new HashMap<String,String>();
        user.put("name", "John");
        user.put("city", "Bengaluru");
        user.put("car", "Audi");

        System.out.println(user);
        System.out.println(user.size());

        System.out.println(user.get("name"));
        user.remove("car");
        // user.clear();

        System.out.println(user);

        // looping through the keys of the HashMap
        for(String key:user.keySet()){
            System.out.println(key);
        }

        // looping through the values of the HashMap
        for(String value:user.values()){
            System.out.println(value);
        }

        System.out.println(user.keySet());
        System.out.println(user.values());
    }

    public void f2(){
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 35);
        people.put("Mukesh", 70);
        System.out.println(people);

        // looping through the keys of the HashMap
        for(String key: people.keySet()){
            System.out.println(key + " " + people.get(key));
        }
    }
}

// methods: put(), get(), remove(), clear(), size()