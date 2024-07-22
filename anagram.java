package java_programs;

import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String one="sap";
        String two="pas";
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<one.length();i++)
        {
            char ch=one.charAt(i);
            if(map1.get(ch)==null)
            {
                map1.put(ch,1);
            }
            else{
                map1.put(ch,map1.get(ch)+1);
            }
        }
        for(int i=0;i<two.length();i++)
        {
            char ch=two.charAt(i);
            if(map2.get(ch)==null)
            {
                map2.put(ch,1);
            }
            else{
                map2.put(ch,map2.get(ch)+1);
            }
        }

        System.out.println(map1.equals(map2));
    }
}
