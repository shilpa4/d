
	import java.util.Scanner;




	public class maxnum {
		public static void main(String [ ] arg) {
			int a[]=new int[10];
			Scanner name=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]=name.nextInt();
		}
		
			for(int j=0;j<3;j++)
		{
				for(int k=j+1;k<3;k++)
				{
				if(a[j]>a[k])
				{
					int tmp=a[j];
					a[j]=a[k];
					a[k]=tmp;
					
				}
			}
			}
		System.out.println(a[2]);
			
		
			
			 
		}

	}

