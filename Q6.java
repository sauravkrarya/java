//Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.*;
class Oldest{
	public static void main(String[] S)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First person age : ");
		int a1=sc.nextInt();
		System.out.print("Enter Second person age : ");
		int a2=sc.nextInt();
		System.out.print("Enter Third person age : ");
		int a3=sc.nextInt();


    if(a1>a2 && a1>a3)
        System.out.println("> First person is oldest");
    else if(a2>a1 && a2>a3)
        System.out.println("> Second person is oldest");      
    else 
        System.out.println("> Third person is oldest");



    if(a1<a2 && a1<a3)
        System.out.println("> First person is yongest");
    else if(a2<a1 && a2<a3)
        System.out.println("> Second person is yongest");      
    else 
        System.out.println("> Third person is yongest");
	}
}


      
    

