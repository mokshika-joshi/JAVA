import java.util.Scanner;
class Employee{
	int empId;
	String name;
	double salary;
	Employee(){

	}
	Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString(){
		return empId+" "+name+" "+salary;
	}
	@Override
	public boolean equals(Object o){
		if(empId.equals(empId)){
			return true;
		}
	}
}
class asgn50{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		Employee ar[]=new Employee[5];
		System.out.println("Enter id , name , salary");
		for(int i=0;i<5;i++){
			int empId=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			Employee e=new Employee(empId,name,salary);
			System.out.println(e);
		}
	}
}