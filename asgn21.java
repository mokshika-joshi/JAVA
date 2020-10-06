import java.util.Scanner;
class asgn21{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int num = sc.nextInt();
		int arr[] = new int[10];

		for(int i=0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for(int a : arr)
		{
			sum = a+sum;	
		}
		
		double avg = sum/10.0;

		System.out.println("Sum : "+ sum);
		System.out.printf("Average : %.2f"+ avg);
	}

}