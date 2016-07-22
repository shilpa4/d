import java.util.Scanner;


public class power {
    public static void main(String [] args){
    int num;
    int out;
    Scanner ss=new Scanner(System.in);
    num=ss.nextInt();
    int a;
    System.out.println("power is=");
    Scanner sa=new Scanner(System.in);
    a=sa.nextInt();

    {
    	
    	out=(int) Math.pow(num,a);
    	System.out.println(out);	
    }
    }
}
