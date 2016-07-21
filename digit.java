import java.util.Scanner;


public class digit {
	public static void main(String [ ] arg){

	int n,a;
	int sum,out;
	Scanner name=new Scanner(System.in);
	System.out.println("enter the number");
	n=name.nextInt();
	 a=n%10;
	while(n>10){
		n=n/10;
	}
	 out=a+n;
	System.out.println(out);
	
	
	}
}
