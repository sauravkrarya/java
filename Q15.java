//Write a program that asks the user to input a number between 1 and 7. Print the corresponding day of the week (1 for Monday, 2 for Tuesday, etc.). If the input is not between 1 and 7, print "Invalid input."



import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number from 1 to 7");
        int input=sc.nextInt();
        if(input==1){
            System.out.println("monday");
        }
        else if(input==2){
            System.out.println("tuesday");

        }
        else if(input==3){
            System.out.println("wednesday");
        }
        else if(input==4){
            System.out.println("thrusday");
        }
        else if(input==3){
            System.out.println("friday");
        }
        else if(input==3){
            System.out.println("saturday");
        }
        else{
            System.out.println("invalid number please input valid number");
        }

    }
    
}
