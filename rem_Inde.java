package java_programs;

public class rem_Inde {
    public static void main(String[] args) {    //using INDEX
        int arr[]={1,1,2,3,3,4,5,5,6,7};
        int j=0;
        
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i]!=arr[i+1])
        {
            arr[j]=arr[i];
            j++;
        }
      }
      arr[j]=arr[arr.length-1];
      for(int k=0;k<=j;k++)
      {
        System.out.println(arr[k]);
      }
    }
}
