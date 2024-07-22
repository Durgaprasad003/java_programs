package java_programs;

public class countingstring {
    public static void main(String[] args) {
        String email="kelladurgaprasad92@gmail.com";
        char ch[]=email.toCharArray();
        int digit=0;
        int letter=0;
        int space=0;
        int other=0;
        for (char c : ch) {
            if(Character.isDigit(c))
            {
                digit++;
            }
            else if(Character.isLetter(c))
            {
                letter++;
            }
            else if(Character.isSpaceChar(c))
            {
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("the number of digits are"+digit);
        System.out.println("the number of spaces are"+space);
        System.out.println("the number of letters are"+letter);
        System.out.println("the number of letters are"+other);
    }
}
