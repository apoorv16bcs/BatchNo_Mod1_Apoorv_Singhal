package lab10;

@FunctionalInterface
interface Lab10Assign2Fun{
	public String modify(String str);
}

public class Lab10Ex2 {

	public static void main(String[]args) {
		String str="ABES";
		Lab10Assign2Fun s1=(s)->
		{
			String a="";
			for(int i=0;i<s.length();i++) {
				char b=s.charAt(i);
				a+=b+" ";
			}
			a.trim();
			return a;
		};
		System.out.println(s1.modify(str));
	}
}

