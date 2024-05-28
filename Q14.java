//  Write a program that asks the user to input the lengths of three sides of a triangle. Determine if the 
// input can form a valid triangle.


import java.util.*;
class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side");
        int a=sc.nextInt();
        System.out.println("enter second side");
        int b=sc.nextInt();
        System.out.println("enter third side");
        int c=sc.nextInt();
         if ((a+b>c) && (a+c>b) && (b+c>a)){                    // 10 15 5
            System.out.println("valid traingle");
         }
         else{
            System.out.println("not valid triangle");
         }

    }
    
}
