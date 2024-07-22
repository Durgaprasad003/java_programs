package java_programs;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        // right rotate array by 1 element   12345   -> 51234
        int arr[]={1,2,3,4,5};
        int last=arr[arr.length-1];
        System.out.println(last);
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
