//62.Create a class that checks 
//whether a given number is prime or not using  Runnable interface.

import java.util.Scanner;

class My implements Runnable{
	int n;
	
	public My(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		int i,m=0,flag=0;      
		m=n/2;      
		if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		}else{  
		   for(i=2;i<=m;i++){      
			   if(n%i==0){      
				   	System.out.println(n+" is not prime number");      
				   	flag=1;      
				   	break;      
			   }      
		   }      
		   if(flag==0)  { 
			   System.out.println(n+" is prime number"); 
		   }  
	}

		
	}
	
}

public class asgn62 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		My m = new My(n);
		m.run();
	}

}