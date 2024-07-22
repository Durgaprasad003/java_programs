package java_programs;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+(number*i));
        }
        System.out.println("this is the end of multiplication table🥹🥹");
    
    }
}
