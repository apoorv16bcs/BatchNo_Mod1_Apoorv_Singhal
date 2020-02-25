package lab1;

public class Exercise1 {
	
	public int CalculateSum(int n) {
		int s=0;
		for(int i=0;i<n;i++){
			if(i%5!=0&& i%3!=0)
				s=s+i;
			
		}
		return (n*(n-1)/2)-s;
		
	}
	public static void main(String[] args) {
		Exercise1 ex=new Exercise1();
		System.out.println(ex.CalculateSum(15));
	}

}
