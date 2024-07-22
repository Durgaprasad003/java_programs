package java_programs;

public class integertostring {
    public static void main(String[] args) {
        int num=5;
        // System.out.println(num.length); it will not give length because length is a function for strings
        // System.out.println(Integer.toString(num+1));
        String nums=Integer.toString(num);

        System.out.println(nums+1);
        String numm=String.valueOf(num);
        System.out.println(numm.length());
        System.out.println(numm+2);
    }
}
