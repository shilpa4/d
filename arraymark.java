package guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class arraymark {
	public static void main(String arg[]){
		String a[]=new String [2];
	Scanner ff=new Scanner(System.in);
	for(int h=0;h<2;h++){
		a[h]=ff.nextLine();
	}
	ArrayList <String> dd=new ArrayList<String>();
	for(int i=0;i<2;i++){
		dd.add(a[i]);
	}
	System.out.println(dd);
	int len=dd.size();
String arr[]=new String[len];
	for(int j=0;j<len;j++){
		arr[j]= dd.get(j).toString();
		System.out.println(arr[j]);
	}
	int d=0;
	String name;
	String out[]=new String[len];
	int num;
	for(int k=0;k<2;k++){
		num=0;
		out[d]="";
		name="";
	String ss[]=arr[k].split("#");
	for(int q=0;q<ss.length;q++){
		if(q==0){
			name=name+ss[q];
		}
		else{
		num+=Integer.parseInt(ss[q]);
		}
	}
				out[d]=name+"."+num;
				d++;
	}	
	int x=0,n1;
	int sub[]=new int[5];
	String nnn[]=new String[5];

	for(int z=0;z<d;z++){
	n1=out[z].indexOf(".");
	nnn[x]=out[z].substring(0,n1);
	System.out.println(nnn[x]);
	sub[x]=Integer.parseInt(out[z].substring(n1+1));
	System.out.println(sub[x]);

	x++;
	
	}
	
	for(int e=0;e<x;e++){
		for(int b=e+1;b<x;b++){
			if(sub[e]>sub[b]){
				int tmp=sub[e];
				sub[e]=sub[b];
				sub[b]=tmp;
			}
		}
	}
	System.out.println(sub[x-1]);
	for(int r=0;r<x;r++){
		if(sub[x-1]==sub[r]){
			System.out.println(nnn[r]);
		}
	}
	
	
	
	
	
	}
}
