public class Prof13D{
    public static void main(String[]args)
    {
        int i;
        int f=45;
        int[] org={24,5,3,2,4,45,234};
        for(i=0;i<org.length;i++){
            //System.out.print(org[i]);
            if (org[i]==f){
            System.out.print(i);
            
            break;
            }

        }
        if(i==org.length)
        {
            System.out.print("Value not Found");

        }
        
    }
}