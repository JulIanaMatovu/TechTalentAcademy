import java.util.HashMap;

public class Artists {
    public static void main(String[] args) {
        //Create a simple program to practice using HashMaps that will store key-value pairs
        HashMap<String, String> artistLyrics = new HashMap<String, String>();
        artistLyrics.put("Dave", "Teachers were giving man tests, same time mandem were giving out testers");
        artistLyrics.put("HouseFires","All your promises are Yes and Amen");
        artistLyrics.put("ABBA","Boogie! Boogie!");
        artistLyrics.put("Madonna","Hollidaaaaay, Celebrate!");

        System.out.println(artistLyrics + "\n"); //prints entire
        System.out.println(artistLyrics.get("Dave")+ "\n");

        /** note:
         * HashMap does not maintains insertion order in java.
         * Hashtable does not maintains insertion order in java.
         * LinkedHashMap maintains insertion order in java.
         *
         *
         * Keys and values in a HashMap are actually objects.
         * String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class:
         * Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc
         */

        //for loop for all the keys
        System.out.println("\nKeys of Hashmap:");
        for (String i: artistLyrics.keySet()) {
            System.out.println(i);
        }

        //for loop for all the values
        System.out.println("\nValues of Hashmap:");
        for (String j: artistLyrics.values()) {
            System.out.println(j);

        }



    }
}
