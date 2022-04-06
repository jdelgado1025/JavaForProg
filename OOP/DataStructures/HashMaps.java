package OOP.DataStructures;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> tea = new HashMap<String, Integer>();
        tea.put("Oolong", 185);
        tea.put("Green", 212);

        for (String key : tea.keySet()) {
            System.out.println("Brew " + key + " tea at " + tea.get(key));
        }
    }
}
