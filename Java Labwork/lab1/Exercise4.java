package lab1;
import java.lang.Math;
import java.util.Scanner;
public class Exercise4 {
	public boolean checknNumber(int n) {
		double a;
		a=n;
		for(int i=0;i<n;i++) {
			if(a==Math.pow(2,i))
				return true;
		}
		return false;
	}
public static void main(String[] args) {
	Exercise4 ex4=new Exercise4();
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	System.out.println("the answer is "ex4.checknNumber(10000));
}
}
