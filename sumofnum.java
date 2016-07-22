import java.util.Scanner;


public class sumofnum {
	public static void main(String[] args) {
	int num;
	int sum=0;
	 Scanner ss=new Scanner(System.in);
	    num=ss.nextInt();
	    for(int i=0;i<=num;i++){
	    	sum=sum+i;
	    }
	    System.out.println(sum);
	}
}
