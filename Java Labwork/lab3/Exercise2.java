package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public String getSorted(String str1) {
		
		char a[]=str1.toCharArray();
		Arrays.sort(a);
		return new String(a);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Exercise2 obj=new Exercise2();
               Scanner scan=new Scanner(System.in);
               String s1=scan.next();
               String res1="",res2="";
               String reserve=obj.getSorted(s1);
               for(int i=0;i<reserve.length()/2;i++) {
            	   res1=reserve.toUpperCase();
               }
               for(int j=reserve.length()/2+1;j<reserve.length();j++) {
            	  res2=reserve.toLowerCase(); 
               }
               System.out.println(res1+""+res2);
	}

}
