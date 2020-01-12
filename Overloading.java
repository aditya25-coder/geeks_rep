public class Overloading
{   static int sum(int a,int b)
    {
        return(a+b);
    }
    static int sum(int a,int b,int c)
    {
        return(a+b+c);
    }
    public static void main(String[] args)
    {   
        int a=2,b=4,c=10;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}