package java_programs;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();
        boolean isleapyear=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    isleapyear=true;
                }
                else{
                    isleapyear=false;
                }
            }
            else{
                        isleapyear=true;
            }
        }
        else{
            isleapyear=false;

        }
        if(isleapyear)
        {
            System.out.println("this is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }

  
}

