public class Lab12E{
    public static void main(String[]args)
    {
        int[] nums={6,7,8,9};
        int Mul=1;
        for(int i=0;i<nums.length;i++)
        {
        for(int j=1;j<=10;j++)
            Mul=j*nums[i];
            System.out.print(Mul);
        }
        System.out.println();
}
}