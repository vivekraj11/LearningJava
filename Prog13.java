public class Prog13{
    public static void main(String[]args)
    {
        int[] a={1,2,3,4,1,34};
        float sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int len=a.length;
        float avg=sum/len;
        System.out.println(avg);
        
    }
}