package lab5;

import java.util.Scanner;

public class Exercise2 {

	public static int Fib(int no) {
		if(no==1)
			return 1;
		if(no==2)
			return 1;
		else
			 return (Fib(no-1)+Fib(no-2));
		
	}
	
	public static int IterativeFib(int no) {
		
		int i,c3=0;
		int a1=1,b2=1;
		for(i=1;i<n-1;i++){
	   		c3=a1+b2;
		   a1=b2;
		   b2=c3;
		}
		
		return c3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int z=no;
		int c3=IterativeFib(n);
		System.out.println("nth value is "+c3);
		int fib=Fib(z);
		System.out.println("Recursively nth value is "+fib);
		
	}

}
