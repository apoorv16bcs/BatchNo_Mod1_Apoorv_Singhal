package lab1;

public class Exercise2 {
	public int CalculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=i*i;
			sum2+=i;
		}
		sum2=sum2*sum2;
		return sum1-sum2;


}
	public static void main(String[] args) {
		Exercise2 ex2=new Exercise2();
		System.out.println("the difference is" +ex2.CalculateDifference(10));
	}
}
