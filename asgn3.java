class asgn3{
	public static void main(String arge[]){
	int x = 2;
	int y = x*x+3*x-7;

	System.out.println(y);
	y = x++ + ++x;
	System.out.println(y);
	int z = x++ - --y - --x + x++;
	System.out.println("value of z ="+z);
	System.out.println("value of y ="+y);
	System.out.println("value of x ="+x);

	boolean b1 = true;
	boolean b2 = false;
	boolean z1 = b1 && b2 || !(b1 || b2);
	System.out.println(z1);
	}
}