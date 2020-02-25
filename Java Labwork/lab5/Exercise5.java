package lab5;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String str) {
		super(str);
	}
}
public class Exercise5 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=scan.nextInt();
		if(age<15)
			throw new AgeException("Age should be above 15");
		else
			System.out.println(" Enter Valid age");
	}

}
