// A shop will give a discount of 10% if the cost of the purchased quantity is more than 1000. Ask the user for quantity Suppose, one unit will cost 100. Judge and print the total cost for the us


import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity which you want to buy");
        int quantity =sc.nextInt();
        int cost=100*quantity;
                 if  (cost>1000){
                    System.out.println("your are eligible for discount");
                    int after_discount=(10*cost)/100;

                    System.out.println(" total bill "+ cost);
                    System.out.println(" your discount "+ after_discount);
          
        }
           else{
                System.out.println("no discount sorry!");
        }
    }
    
}
