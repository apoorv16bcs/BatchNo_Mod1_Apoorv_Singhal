package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public void getSorted() {
		
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int arrays1[]=new int[3];
		for(Integer i:arrays1) {
			arrays1[i]=scan.nextInt();
		}
		String str1=Arrays.toString(arrays1);
		
		System.out.println(str1);
	
	}
}
