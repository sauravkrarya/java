//Write a program to check whether an entered character is lowercase ( a to z ) or uppercase ( A to Z ).

import java.util.*;
class Q11
{
        public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
       
        System.out.println("enter any character");
        char alp=sc.next().charAt(0);
        int num =(int)alp;
        if (num>=97 && num<=122 )
            {
                System.out.print ("character is lowercase" + alp);
            }
        else if (num>65 && num<=90) 
            {
                System.out.print("character is in uppercase" + alp);
            }
        else{
                System.out.println("wrong input");
            }
    }
}
