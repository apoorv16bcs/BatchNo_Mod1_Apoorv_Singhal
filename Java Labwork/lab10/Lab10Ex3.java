package lab10;

@FunctionalInterface
interface Accept{

	public boolean check(String user,String pass);
}
public class Lab10Ex3 {

	public static void main(String[]args) {
		String user="apoorvsinghal@gmail.com";
		String pass="apoorv";
		Accept a=(s1,s2)->{
			if(s1.equals("apoorvsinghal@gmail.com") && s2.equals("apoorv"));
			return true;
		};
		System.out.println(a.check(user,pass));
	}
}
