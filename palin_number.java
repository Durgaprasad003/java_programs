package java_programs;

public class palin_number {

    public static boolean isPalindrome(int number) {
        // Convert the number to string
        String str = Integer.toString(number);
        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;
        
        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int originumber=241;
        int number=originumber;
        int reversenum=0;

        while(number!=0)
        {
            int remainde=number%10;
            reversenum=reversenum*10+remainde;
            number/=10;
        }
        if(originumber==reversenum)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not ");
        }














        // if(isPalindrome(number))
        // {
        //     System.out.println("palindrome");
        // }

    }
}
