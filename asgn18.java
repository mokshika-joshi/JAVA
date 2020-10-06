import java.util.Scanner;
class asgn18{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number = ");
	int a = sc.nextInt();
	if( a==0 || a==1 || a==2)
	System.out.println("Not a prime number");
	else
	{
		for(int i=0; i<=a/2; i++)
		if(a%i==0)
		{
			System.out.println("Not a prime number");
			break;
		}
		else{
			if(i==a/2)
			System.out.println("Prime number");
			else
			continue;
		}
	}
	}
}