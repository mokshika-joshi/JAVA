import java.util.*;
import java.util.Scanner;

class asgn13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest = sc.nextInt();

		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		System.out.println("Enter the third number: ");

		if(a>b && a>c){
			System.out.println("The greatest number is "+a);
		}
		else if(b>a && b>c){
			System.out.println("The greatest number is "+b);
		}
		else
			System.out.println("The greatest number is "+c);
	}
}