package day35;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept
{
    public static void main(String[] args) {
        //HashSet<String> hs = new HashSet<>();
        Set<String> hs = new HashSet<>();
        hs.add("Jason");
        hs.add("Lee");
        hs.add("Ben");
        hs.add("Rohit");
        hs.add("Kerrie");
        hs.add("Kerrie");
        System.out.println(hs);

        for(String s : hs)
        {
            System.out.println(s);
        }
    }
}

//Order is not maintained
//Holds no duplicate values