package guvi;

public class mailcheck {
	public static void main(String arg[]){
		String str="test@gmail.com";
		String cc=".com";
		int a=0,s=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==(64)){
			a++;
		}
	}
	
	
	int si=str.indexOf('@');
	int se=str.indexOf('.');

	String word=str.substring(0,si);
	String word1=str.substring(se);
	if(word1.equals(cc)){
		s++;
	}
	String word2=str.substring(si,se);
	int len=word2.length();
	//System.out.println(word2);

	System.out.println(len);
	if(a==1 && s==1 && word.length()>=3 && len==6 ){
		System.out.println("hhh");
	}
}
}
