package OOP.DataStructures;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.sound.midi.SysexMessage;

public class Sets {
    /*
        Similar to collections, but only contains unique values
        There are three types: HashSets, LinkedHashSet, TreeSet
    */
    public static void main(String[] args) {
        // Create a HashSet that will contain String values:
        Set<String> colors = new HashSet<String>();
        // Add items to Set:
        colors.add("red");
        colors.add("blue");
        colors.add("blue"); // Duplicate value
        
        System.out.println(colors); // Prints: [red, blue]
        
        // Create a TreeSet that will contain Integer values:
        TreeSet<Integer> myNumbers = new TreeSet<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(1);

        System.out.println(myNumbers);
        myNumbers.remove(2);
        System.out.println(myNumbers);
    }
}
