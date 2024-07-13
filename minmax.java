import java.util.*;
class minmax{

	public static int getMin(int arr[], int n) {
		int min=arr[0];
		for(int i=1; i<n; i++){
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	public static int getMax(int arr[], int n) {
		int max=arr[0];
		for(int i=1; i<n; i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
    public static void main(String[] args)
	{
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
		System.out.println("min :"+getMin(arr, n));
        System.out.println("max :"+getMax(arr,n));
    }
}
