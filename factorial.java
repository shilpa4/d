import java.util.Scanner;


public class factorial {
	public static void main(String [ ] arg) {
		int n,result=1;
		Scanner name=new Scanner(System.in);
		n=name.nextInt();
		for( int i=1;i<=n;i++)
		{
		result=result*i;
		}
		System.out.println(result);
		
	}
}
