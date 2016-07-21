import java.util.Scanner;


	import java.util.Scanner;

	public class vowelstringremove {

		    public static void main(String [] args){
		      String s1;
		      Scanner fa=new Scanner(System.in);
		      s1=fa.next();
		   StringBuffer ff=new StringBuffer(s1);
		 ff.reverse();
		 String rr=new String(ff);

		    System.out.println(ff);
		    String sa=rr.replaceAll("[aeiouAEIOU]","");
		  System.out.println(sa);
		    
		    
		    
		    
		    
		}

	}

