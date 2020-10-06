//54.	Write a program to reverse the given String.

import java.util.Scanner;

public class asgn54 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name ");
	String name = sc.next();
	StringBuilder str = new StringBuilder(name);
	str = str.reverse();
	System.out.println(str);
	}
}