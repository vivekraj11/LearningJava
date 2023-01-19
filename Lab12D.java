import java.util.Random;
public class Lab12D{
    public static void main(String[]args)
    {
        int[] nums={6,7,8,9,10};
        int sumEven=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sumEven=sumEven+nums[i];
            }
        }
        System.out.println(sumEven);
}
}