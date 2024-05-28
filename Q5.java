//  A school has the following rules for the grading system:                             
// a. Below 25 - F; b. 25 to 45 - E; c. 45 to 50 - D ; d. 50 to 60 - C; e. 60 to 80 - B; f. Above 80 - A. Ask the user to enter marks and print the corresponding grade.


import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pecentage");
        float per=sc.nextFloat();
        if(per>=80 && per<=100){
            System.out.println("your grade is 'A' ");
          }
        else if(per>=60 && per<80){
            System.out.println("your grade is 'B");
        }
        else if(per>=50 && per<60){
            System.out.println("your grade is 'C");
        }
        else if(per>=45 && per<50){
            System.out.println("your grade is 'D");
        }
        else if(per>=25 && per<45){
            System.out.println("your grade is 'E");
        }
        else if(per<25){
            System.out.println("your grade is 'F");
        }
        else
        System.out.println( "wrong choice");
    }
    }
    

