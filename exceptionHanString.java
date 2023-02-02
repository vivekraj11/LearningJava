package practice;
import java.util.*;

public class exceptionHanString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		try {
		String name=sc.nextLine();
		System.out.println(name.length());
		}
		catch(Exception e) {
			System.out.println("Name can't be null");
			
		}
		
		
		
}

}
