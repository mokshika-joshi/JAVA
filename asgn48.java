import java.util.Scanner;
abstract class Processor{
	double data;

	void showData(){
		System.out.println(data);
	}

	abstract void process();
}

class factorial extends Processor{
	void process(){
		int n = 5;
		int sum = 1;
		for(int i=1; i<=n; i++){
			sum = sum * i;
		}
		data = sum;
	}
}

class circle extends Processor{
	void process(){
		int r = 5;
		double area;
		area = 3.14f * r * r;
		data = (double)area;
	}
}

class asgn48{
	public static void main(String args[]){
		Processor p = new factorial();	//object should be created of fatorial but reference is taken of processor
		Processor p1 = new circle();
		p.process();
		p1.process();
		p.showData();	
		p1.showData();
	}
}