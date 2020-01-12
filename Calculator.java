import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1:Addition\t\t2:Substraction\n3:Multiplication\t4:Division\n");
        int ch=in.nextInt();
        System.out.println("Enter two numbers\n");
         int a=in.nextInt();
         int b=in.nextInt();
        switch(ch)
        {
            case 1:int sum=a+b;
                   System.out.println("The sum is\t:"+sum);
                   break;
            case 2:int sub=a-b;
                    System.out.println("The Difference is\t:"+sub);
                    break;
            case 3:int mul=a*b;
                    System.out.println("The product is\t:"+mul);
                    break;
            case 4:if(b==0)
            {
                System.out.println("\nInvalid input\n");
            }
            else
            {
                float div=(a/b);
                System.out.println("The answer is\t:"+div);
            }
            break;
        }
        in.close();
    }
}