
	import java.util.Scanner;


	public class duplicate {

			public static void main(String [ ] arg){
			String a;

			Scanner name = new Scanner(System.in);
			a=name.nextLine();
			char chr[] = new char[10];
			int k = 0, num = 0;
			int flag;
			for (int i = 0; i < a.length(); i++) {
				flag = 0;
				for (int j = i + 1; j < a.length(); j++) {
					if (a.charAt(i) == a.charAt(j)) {
						flag = 1;
					}}
					if (flag == 0) {
						chr[k] = a.charAt(i);
						k++;
						num++;
					
				}
			}
			System.out.println("The string is\n");
			
			for (int t = 0;t<=num; t++){
				System.out.print(chr[t]);
			}

		}
		}



