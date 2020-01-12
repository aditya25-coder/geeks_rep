import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        int sum=0;
        int i=0;
        System.out.println("Enter size of array");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] array=new int[n];
        for(i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("The sum is\t:"+sum);
        in.close();
    }
}