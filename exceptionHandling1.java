package MTsir;

import java.util.Scanner;

public class exceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		divide(a,b);

	}
	static void divide(int a, int b) {
		try {
			System.out.println(a/b);
			}catch(Exception e) {
				System.out.println("A Number cannot be divided by zero");
				
			}
		
	}

}
