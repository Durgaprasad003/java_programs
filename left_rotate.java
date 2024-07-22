package java_programs;

import java.util.Arrays;

public class left_rotate {
    public static void main(String[] args) {
        // left rotate by 1 element 
        int arr[]={1,2,3,4,5};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=1;
        System.out.println(Arrays.toString(arr));
    }
}
