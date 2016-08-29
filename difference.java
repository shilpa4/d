package guvi;

public class difference {
	public static void main(String arg[]){
	int a[]={2,3,4,2,3};
	int c[]=new int[5];
	int k=0;
	for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<=i+1;j++){
			c[k]=a[i]-a[j];
			k++;
		}
	}
	
	for(int p=0;p<k;p++){
	//System.out.println(Math.abs(c[p]));
		}
	
	for(int e=0;e<k;e++){
		for(int b=e+1;b<k;b++){
			if(c[e]>c[b]){
				int tmp=c[e];
				c[e]=c[b];
				c[b]=tmp;
			}
		}
	}
	int dd=c[k-1];
	
	for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<=i+1;j++){
			if((a[i]-a[j])==dd){
			System.out.println(i);
			}
		}
	}
	
	
	}
}
