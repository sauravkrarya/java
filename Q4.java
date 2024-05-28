//A company decides to give bonus of 5% to the employee if his/her year of service is more than 5 years. Ask the user for their salary and year of service and print the net bonus amount.

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year of experience");
        int year=sc.nextInt();
        if (year>5){
            System.out.println("You are eligible for bonus");
            System.out.println("Enter your salary");
            double salary= sc.nextDouble();
            double bonus =(5*salary)/100;
            System.out.println("total salary:"+ (salary+bonus));
           }
           else
           System.out.println("you are not eligible for bonus");
           
    }
    
}
