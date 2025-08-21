package day35;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {
    public static void main(String[] args) {
        //HashMap<String, Integer> phonebook = new HashMap<>();
        Map<String, Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("Jason", 44645);
        phonebook.put("Roger", 467645);
        phonebook.put("Lee", 556677);
        phonebook.put("Kerrie", 765778);
        phonebook.put("Maddy", 765778);
        phonebook.put("Rose", 9875);
        phonebook.put("Rose", 5555);

        System.out.println(phonebook);
        System.out.println(phonebook.keySet());
        System.out.println(phonebook.values());
    }

}
