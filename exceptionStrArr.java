package practice;
import java.util.*;

public class exceptionStrArr {

	public static void main(String[] args) {
		String[]student= {"Vivek","Anish","Manish","Ravi","Sonu","Ram"};
		Random ran = new Random() ;
		try {
			int in = ran.nextInt(7) ;
			System.out.println(in);
			System.out.print(student[in]);
			}
		catch(Exception e) {
		System.out.println("Not Found");
		}
	}
}