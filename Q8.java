//A student will not be allowed to sit in an exam if his/her attendance is less than 75%. Take the following input from the user Number of classes held and Number of classes attended. And the print percentage of class attended Is the student is allowed to sit in the exam or not.

import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total classes which held");
        double totalclass =sc.nextDouble();

        System.out.print("Enter the number of classes attended: ");
        double  totalattend =sc.nextDouble();
        
        double percentageofattendance= totalattend/totalclass * 100;
        System.out.println(percentageofattendance +" %");

        if (percentageofattendance >= 75 && totalattend<totalclass){
            System.out.println("you are allowed to seat in exam");
        }

        else if (totalattend>totalclass){
            System.out.println("wrong input ,please input valid attendance");
        }
         else {
          System.out.println("You are not allowed to sit in exam because your attendance in less than 75%");
        
            
        }
    
    }
    
}
