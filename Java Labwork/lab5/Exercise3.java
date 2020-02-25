package lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		int no;
		int c=0;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<no;i++) {
			c=0;
			for(int j=1;j<no;j++) {
				if(i%j==0)
					c++;
			}
			//System.out.println(c);
			if(c<=2)
				System.out.println(i);
		}
		
	}
}
