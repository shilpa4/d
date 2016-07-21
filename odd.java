import java.util.Scanner;


public class odd {
	public static void main(String [ ] arg) {
		int n,sum=0;
		Scanner name=new Scanner(System.in);
		System.out.println("enter the number");
		n=name.nextInt();
	for(int i=1;i<=n;i++){
		if(i%2!=0){
			System.out.println(i);
			sum=sum+i;
		}
	}
		System.out.println("sum"+sum);
	
	}
}
