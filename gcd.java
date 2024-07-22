package java_programs;

public class gcd {
    public static void main(String[] args) {
        int first=12;
        int second=24;
        int gcd=0;
        for(int i=1;i<=first && i<=second;i++)
        {
            if(first%i==0 && second%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
