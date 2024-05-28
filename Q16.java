//Write a program that asks the user to input a single character. Determine if the character is an uppercase letter, lowercase letter, digit, or special character, and print the result.


import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the chracter");
        char alpha=sc.next().charAt(0);
        int num =(int)alpha;
       
        if(num>=65 && num<=90){
            System.out.println("alphabet is in uppeer case");
        }
        if(num>=97 && num<=122){
            System.out.println("alphabet is in lower case");
        }
        
    }
    
}
