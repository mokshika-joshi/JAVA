import java.util.Scanner;

interface taxable{
	double salesTax = 0.07;
	double incomeTax = 0.010;

	void calcTax();
}

class employee implements taxable{
	int empid;
	int salary;
	String name;

	employee(){
		
	}

	employee(int empid, int salary, String name){
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}

	public void calcTax(){
		double incomeTax1 = salary * 0.7;
		System.out.println("Total income = "+ incomeTax1);
	}

}

class product implements taxable{
	int pid;
	int price;
	int quantity;

	product(){
		
	}

	product(int pid, int price, int quantity){
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public void calcTax(){
		double salesTax1 = (price*quantity) * salesTax;
		System.out.println("Total salestax = "+ salesTax1);
	}

}

class asgn49{
	public static void main(String args[]){
		taxable t = new employee(1, 20000, "Jane");
		taxable t1 = new product(1, 900, 5);
		t.calcTax();
		t1.calcTax();
		
	}
}