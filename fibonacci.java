package java_programs;

/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        int number=50;
        int a=1;
        int b=1;
        int f=0;
        System.out.print(a+" ");
        System.out.print(b+"");
        while(f<=number)
        {
            f=a+b;
            System.out.print(f+" ");
           
           
            a=b;
            b=f;

        }
    }
}