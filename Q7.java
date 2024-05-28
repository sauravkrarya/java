//Write a program to print the absolute value of a number entered by the user. 
// E.g.- (INPUT: 1  OUTPUT: 1),      (INPUT: -1        OUTPUT: 1)


import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int num=sc.nextInt();
        if(num>1){
            System.out.println(num*1);
        }
        else if(num<-1){
            System.out.println((num*-1));
        }
        else{
            System.out.println("wrong choice");
        }
    }
    
}
