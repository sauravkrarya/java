import java.util.*;
public class printarray{

    public static void main(String[] args) {
        
       // int arr1[]={1,2,3,4,5,6};
       Scanner sc=new Scanner(System.in);
       int arr2[]=new int[5];

       for(int i=0;i<5;i++){
          arr2[i]=sc.nextInt();
          
       }
       for(int i=0;i<5;i++){

       System.out.print(arr2[i] +" ");

    }
}
}