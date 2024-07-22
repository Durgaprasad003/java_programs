package java_programs;

public class rem_duplicates {      //finding duplicate elements
    
    public static void main(String[] args) {
        int arr[]={1,3,4,3,5,3,2,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("duplicate elements are"+arr[i]);
                }
            }
        }
    }
}
