//Write a Java program that uses a for-loop to print the multiplication table of a given number N.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
         
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
    
}
