package java_programs;

import java.util.Arrays;

/**
 * right_rotate
 */
public class right_rotate {

    public static void main(String[] args) {
        // right rotate array by three elements
        int arr[]={1,2,3,4,5};
        int n=2;

        for(int j=1;j<=n;j++)
        {



            int last=arr[arr.length-1];
            System.out.println(last);
            for(int i=arr.length-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
}