import java.util.HashMap;

public class HashMapDemo {

//    public static void main(String[] args) {
//        HashMap<String, String> favoriteFruits = new HashMap<>();
//
//
//        favoriteFruits.put("Alice", "Apple");
//        favoriteFruits.put("Bessy", "Banana");
//        favoriteFruits.put("Olly", "Orange");
//        System.out.println(favoriteFruits.get("Bessy"));
//    }

    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ash", 100);
        ages.put("Ben", 21);
        ages.put("Steve", 80);
        ages.put("Futbol", 2);

//        Integer futbolAge = ages.get("Futbol");
//
//        String output = "Futbol's age is " + futbolAge;
//        System.out.println(output);

        boolean output = ages.containsValue(5);
        System.out.println(output);


        ages.put("Futbol", 2); // inserts a new entry into the HashMap
        ages.get("Futbol"); // gets the value for the given key
        ages.size(); // returns the size of the HashMap as an integer
        ages.clear(); // clears all entries from the HashMap
        ages.containsValue(52); // returns true if the HashMap contains the value
        ages.remove("Alice"); // removes the entry with the given key
        ages.keySet(); // returns a set of all the keys in the HashMap
        ages.values(); // returns a collection of all the values in the HashMap

    }




}
