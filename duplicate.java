//Write a Java program to find the duplicate values of an array in Java.
class duplicate {
    public static void main(String[] args) {
    
        int arr[]={1,2,3,4,2,5,6,7};
        for(int i=0;i<arr.length-1;i++)
           for(int j=i+1;j<arr.length;j++)
             if(arr[i]==arr[j] && i!=j){
                System.out.print(" "+arr[j]);
             }
    }
    
}
