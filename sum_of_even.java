package java_programs;

public class sum_of_even {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;)
        {
                 if(i%2==0)
                 {
                    System.out.println(i+"it is even number we have to add this number");
                    sum=sum+i;
                 }

            i++;
        }
        System.out.println(sum);
    }
}
