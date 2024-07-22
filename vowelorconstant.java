package java_programs;

import java.util.Scanner;

public class vowelorconstant {

    public static boolean isvowel(char ch)
    {
        char c=Character.toLowerCase(ch);
        if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;

        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        boolean isvowel= isvowel(ch);
        if(isvowel)
        {
            System.out.println(ch+"it is vowel");
        }
        else{
            System.out.println("it is not vowel");
        }
        // System.out.println(Math.PI);
    }
}
