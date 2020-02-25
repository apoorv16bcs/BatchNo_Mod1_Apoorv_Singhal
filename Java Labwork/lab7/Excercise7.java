package Lab7;

import java.util.Arrays;

public class Excercise7 {
static int[] getSorted(int arrays1[])
{
	int b,c,d;
	for(int i=0;i<arrays1.length;i++)
	{
		b=arrays1[i];
		c=0;
		while(b!=0)
		{
			c=c*10+b%10;
			b=b/10;
		}
		arrays1[i]=c;
	}
	Arrays.sort(arrays1);
	
	return arrays1;
}
public static void main(String[] args) {
	int arrays1[]= {123,124,125,126,345};
	for(int i:Excercise7.getSorted(arrays1))
	System.out.println(i+" ");
}
}
