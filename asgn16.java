import java.util.Scanner;

public class asgn16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to get table");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int no = num*i;
			System.out.println(no);
		}
	}

}
