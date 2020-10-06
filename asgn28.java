//Initialize one String type of array and print the elements using for each loop

import java.util.*;

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String arr[] = new String[5];
	for(int i=0; i<arr.length; i++){
		arr[i] = sc.nextLine();
	}
	for(String x : arr){
		System.out.println(x);
	}
}