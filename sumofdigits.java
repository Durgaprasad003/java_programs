package java_programs;

public class sumofdigits {
    public static void main(String[] args) {
        // given no is 2122 then it should perform the addition  2+1+2+2 
            int num=2324;
            int sum=0;
            while(num!=0)
            {
                int remainder=num%10;
                sum+=remainder;
                num=num/10;
            }
            System.out.println(sum);
        }
}
