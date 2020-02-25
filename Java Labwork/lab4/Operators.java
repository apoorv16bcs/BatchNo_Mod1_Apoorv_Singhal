package lab4;

import java.util.Scanner;

public class Operators {

	public static int CubeSum(int n) {
		int res,sum=0;
		while(n!=0) {
			res=n%10;
			sum=sum+(res*res*res);
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int reserve=CubeSum(n);
		System.out.println(reserve);
	}
}
