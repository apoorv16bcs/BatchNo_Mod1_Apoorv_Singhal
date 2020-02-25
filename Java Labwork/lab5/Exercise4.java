package lab5;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("First Name");
		String first=scan.nextLine();
		System.out.println("Last Name");
		String last=scan.nextLine();
		try {
			if(first.isEmpty() || last.isEmpty()) {
				throw new NullPointerException();
			   }
			else
				System.out.println(first+" "+last);
		}catch(NullPointerException e) {
			System.out.println("First and Last name should not be empty");
		}
		
	  }
}
