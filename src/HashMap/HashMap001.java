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
    }
}
