package java_programs;

public class isprimenumber {
    public static void main(String[] args) {
        int number=133;
        boolean isprime=true;
        if(number>1)
        {
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                         isprime=false;
                         break;
                }
            }
        }
        else{
            isprime=false;
        }

        System.out.println("isprime"+isprime);
    
    }
}
