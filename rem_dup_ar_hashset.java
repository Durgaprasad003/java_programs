package java_programs;

import java.util.HashSet;
import java.util.Set;

public class rem_dup_ar_hashset {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,6,6,4};
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
    
      int unq[]=new int[set.size()];

      int index=0;
      for(int num:set)
      {
        unq[index++]=num;
      }
      System.out.println("without duplicated");
      for (int i : unq) {
        System.out.println(i);
      }
  
    }
}
