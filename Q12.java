//Write a program that asks the user to input a number. If the number is positive, check if it's even or odd. If it's negative, check if its absolute value is greater than 100. Print appropriate messages based on these conditions.


import java.util.*;
class Q12 
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number which you want to check");
            int num=sc.nextInt();
            if (num>0){
                   if (num%2==0){
                   System.out.println("number is even");
                   }
                   else{
                    System.out.println("number id odd");
                    }
                }
                 
                    if( num<=-100){
                        System.out.println(num*-1);
                    }
                    else{
                        System.out.println("wrong");
                    }
            
        
    }
    
}
