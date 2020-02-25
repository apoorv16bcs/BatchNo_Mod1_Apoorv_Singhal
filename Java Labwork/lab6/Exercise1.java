package lab6;
import java.util.Scanner;
import java.util.StringTokenizer;
	 
	class Exercise1 {
	    public static void main(String args[]) {
	        int no;
	        int sum=0;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter line of integers with a space gap: ");
	        String str=scan.nextLine();
	        StringTokenizer strtk=new StringTokenizer(str, " ");
	        System.out.println("Integers: ");
	        while (strtk.hasMoreTokens()) {
	            String s=strtk.nextToken();
	            no=Integer.parseInt(s);
	            System.out.println(no);
	            sum=sum+no;
	        }
	        System.out.println("sum of integers is: "+sum);
	    }
	}

