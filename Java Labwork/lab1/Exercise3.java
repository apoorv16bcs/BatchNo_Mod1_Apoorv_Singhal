package lab1;

public class Exercise3 {
	public boolean checkNumber(int n){
		int a,b,c,d;
		a=n;
		b=a%10;
		a=a/10;
		d=b;
		while(a>0) {
			b=a%10;
		if(d<b) 
		break;
			d=b;
			a=a/10;
		}
		if (a==0)
			return true;
		else
			return false;
	
		
	}
	public static void main(String[] args) {
		Exercise3 ex3=new Exercise3();
		if(ex3.checkNumber(13456))
			System.out.println("increasing order "+ex3.checkNumber(13456));
	}

}
