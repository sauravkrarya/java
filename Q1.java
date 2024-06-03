//Q1  Write a Java program that uses a for-loop to calculate the sum of the first N natural numbers, where ‘N’ is provided by the user.


import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N number which you want to sum ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}