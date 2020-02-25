package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public int getSecondSmallestElement(int arrays1[]) {
		Arrays.sort(arrays1);
		return arrays1[1];
	}
	
	public static void main(String args[]) {
		int arrays1[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
			arrays1[i]=scan.nextInt();
		Exercise1 obj=new Exercise1();
		int element=obj.getSecondSmallestElement(arrays1);
		System.out.println(element);
		
	}
}
