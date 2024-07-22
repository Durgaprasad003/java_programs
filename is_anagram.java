package java_programs;

import java.util.Arrays;

public class is_anagram {
    public static void main(String[] args) {
        String first="bat";
        String two="tab";
        char ch[]=first.toCharArray();
        char cha[]=two.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(cha);
        System.out.println(Arrays.equals(ch, cha));
    }
}
