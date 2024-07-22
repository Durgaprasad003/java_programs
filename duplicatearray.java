package java_programs;

import java.util.HashMap;
import java.util.Map;

public class duplicatearray {
    public static void main(String[] args) {
        String name="durga prasad";
        char ar[]=name.toCharArray();
       

        Map<Character,Integer> map=new HashMap<>();
        for (char c : ar) {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
            
        }

        for (Character c:map.keySet()) {
            if(map.get(c)>1)
            {
                System.out.println("the "+c+"is"+map.get(c));
            }
            
        }
    }
}
