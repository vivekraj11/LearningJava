import java.util.Random;
public class Lab12C{
    public static void main(String[]args)
    {
        Random ran = new Random() ;
        int in = ran.nextInt(10) ;
        String[] studName={"Vivek","Raj","Sonu","Zia","Kabir","Arun","Uttam","Anish","Pawan","Dimple"};
        System.out.print(studName[in]);
    }
}
