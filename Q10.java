// If x = 2,  y = 5, z = 0 then find values of the following expressions: a. x == 2 ; b. x != 5 ; c. x != 5 && y >= 5 ; d. z != 0 || x == 2 ; e. !(y < 10)

import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int x=2; 
         int y=5; 
         int z=0;
         boolean a = (x==2);
         boolean b = (x!=5);
         boolean c = (x != 5 && y >= 5);
         boolean d = (z != 0 || x == 2);
         boolean e = !(y < 10);
         
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
    }
    
}


