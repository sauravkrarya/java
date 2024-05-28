//Modify the above question to allow the student to sit if he/she has a medical cause. Ask the user if he/she has a medical cause or not ( 'Y' or 'N' ) and print accordingly.



import java.util.*;
public class Q9 {
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
            System.out.println("wrong input, please input valid attendance");
        }
         else {
          System.out.println("You are not allowed to sit in exam because your attendance in less than 75%");
        
            
        
            System.out.print( "Medical cause? (y/n) ) : ");

           char input= sc.next().charAt(0);

            if(input=='y' || input=='Y')
            System.out.print("You are allowed to sit in exam");

            else
                System.out.println("you are not allowed to seat in exam");
            
        }
    
    }
    
}
