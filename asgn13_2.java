import java.util.*;
import java.util.Scanner;

class asgn13_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int largest;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		System.out.println("Enter the third number: ");

		largest = (a>b && a>c) ? a : (b>c && b>a) ? b : c);

		System.out.println("The largest number is "+ largest);
	}
}