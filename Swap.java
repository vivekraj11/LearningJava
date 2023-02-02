package MTsir;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap S1=new Swap(4,9);
		Swap S2=new Swap(5.5,9.8);
		}


	
	public Swap(int a, int b){
		int temp = 0;
		System.out.println("Before Swapping: "+"a= "+a+" b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: "+"a= "+a+" b= "+b);
		
	}
	public Swap(float a, float b){
		float temp = 0;
		System.out.println("Before Swapping: "+"a= "+a+" b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: "+"a= "+a+" b= "+b);
	}



	public Swap(double d, double e) {
		// TODO Auto-generated constructor stub
	}
	}




