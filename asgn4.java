/*import java.util.Scanner;
class asgn4{

	public static void main(String args[]){
	byte b1 = 127;
	byte b2 = 6;

	byte b3 = (byte)  (b1 + b2);
	System.out.println(b3);
	
	}	

}*/

import java.util.scanner;
class downcast{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 byte value");
	byte x = sc.nextByte();
	byte y = sc.nextByte();
	int z = x+y; //Range was larger than byte
	byte a= (byte)z;
	System.out.println("downcasting = "+a);
	}
}