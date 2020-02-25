package lab5;
import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter red or yellow or green to check Signal");
		String choice=scan.nextLine();
		switch(choice) 
		{
			case "Red": 
				System.out.println("Stop wait ");
				break;
			case "Yellow":
				System.out.println("Ready ...anytime u cann see green signal");
				break;
			case "Green":
				System.out.println("Go");
				break;
			default: 
				System.out.println("Wrong Choice..enter the correct choice");
		}
		
		scan.close();

	}

}

		