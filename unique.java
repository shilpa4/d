package guvi;

public class unique {
	public static void main(String arg[]){
		int a[]={1,2,6,9,9,1,3,6,2};
		int c[]=new int[10];
		int flag=0,k=0;
		for(int i=0;i<a.length;i++){
			flag=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					flag++;
					//System.out.println(flag);
				}
				
			}
			if(flag==1){
				c[k]=a[i];
				k++;
			}
			
		}
		
		for(int p=0;p<k;p++){
			System.out.println(c[p]);
		}
	}

}
