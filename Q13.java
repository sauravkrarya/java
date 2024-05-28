//Write a program that asks the user to input the number of hours they worked in a week. If the number is more than 40, print "Overtime". If the number is exactly 40, print "Full-time". If the number is less than 40 but more than 20, print "Part-time". Otherwise, print "Casual


import java.util.*;

public class Q13 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("input the number of hours you worked in a week");
      int hour=sc.nextInt();
      if(hour>40){
        System.out.println("you worked overtime");
      }
      else if(hour==40){
        System.out.println("you worked full time");
      }
       else if(hour<40 && hour>20){
        System.out.println("you worked part time");
       }
       else{
        System.out.println("you worked casually ");
       }
      
  }
    
}
