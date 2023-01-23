package MTsir;

public class MaxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,44,5,42,15,57};
		int min=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(min<a[i])
				min=a[i];
		}
		System.out.println("The maximum number is:"+min);
		}

	}

