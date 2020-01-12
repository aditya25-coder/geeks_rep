import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==0 || n==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not prime");
		}
		in.close();
	}

}
