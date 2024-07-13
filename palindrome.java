
import java.util.*;
public class palindrome{

   // n=5

   public static boolean pal(int arr[], int n){
      
      int i=0;
      while (i<n/2) {
         if(arr[i] != arr[n-1-i])
            return false;
         i++;
      } 
      return true;
   }


   public static void main(String args[])
    {
        int arr[] = {1,2,3,2,1};
        int n = arr.length;
        if(pal(arr, n))
         System.out.println("Yes !");
        
        else
         System.out.println("NOT !");
    }
}
