package lab10;

import java.util.Scanner;

public class Exercise1 {

	interface funcInterface{
		double operation(int x,int y);
	}
	
	private double operate(int x,int y, funcInterface obj) {
		return ex1.operation(x,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcInterface power=(int x,int y)->Math.pow(x,y);
		Exercise1 ex1=new Exercise1();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println(ex1.operate(a, b,power));
	}

}
