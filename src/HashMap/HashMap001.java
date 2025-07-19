package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap001 {
    public static void main(String[] args) {
        //HashMap Create
        Map<String,Integer> mp=new HashMap<String,Integer>();

        System.out.println(mp);
        //Test all map properties
        //add element
        mp.put("Amit",21);
        mp.put("Rakesh",32);
        mp.put("Vikash",44);
        mp.put("Ramesh",65);
        mp.put("Anuj",87);
        mp.put("Aman",65);
        System.out.println(mp);


        //get element in HashMap
        System.out.println(mp.get("Amit"));
        System.out.println(mp.get("Vishal"));
        System.out.println(mp.get("Rahul"));
        System.out.println(mp.get("Pawan"));

        //size question solution
        System.out.println("HashMap size is:-"+mp.size());

        //keyset in HashMap
        System.out.println("Keyset in HashMap:-"+mp.keySet());

        //HashMapValue
        System.out.println("Values in HashMap:-"+mp.values());

        //putIfAbsent put value
        mp.putIfAbsent("Neha singh",43);
        System.out.println(mp.keySet());
    }
}
