package MTsir;

public class Prog16A {
	static int findMax(int arr[],int x, int y) {
		int max=arr[x];
		for(int i=x;i<=y;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,44,5,42,15,56};
		int n=arr.length;
		System.out.println("The maximum element is: "+findMax(arr,0,n-1));

	}

}
