package OOP.DataStructures;

import java.util.HashMap;

public class HashMaps {
    //Stores key value pairs, where the key can be a different data type
    public static void main(String[] args){
        HashMap<String, Integer> tea = new HashMap<String, Integer>();
        tea.put("Oolong", 185);
        tea.put("Green", 212);

        for (String key : tea.keySet()) {
            System.out.println("Brew " + key + " tea at " + tea.get(key));
        }
    }
}
