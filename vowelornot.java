import java.util.Scanner;


public class vowelornot {
	public static void main(String[] args) {
char g;
	  Scanner fa=new Scanner(System.in);
      g=fa.next().charAt(0);
	if(g=='a' || g=='o' ||  g=='i' ||  g=='e' ||  g=='u' ){
		System.out.println("vowel");
	}
	else{
		System.out.println("consonant");
	}
	
	}
}
