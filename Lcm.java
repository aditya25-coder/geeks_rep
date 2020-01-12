import java.util.Scanner;
public class Lcm
{
    static int gcd(final int n1, final int n2) {
        if (n1 == 0) {
            return n2;
        }
        return gcd(n1 % n2, n1);
    }

    static int lcm(final int n1, final int n2) {
        return (n1 * n2 / gcd(n1, n2));
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers");
        final int a = in.nextInt();
        final int b = in.nextInt();
        System.out.println("lcm="+lcm(a,b));
        in.close();
    }
}