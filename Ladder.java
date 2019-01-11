import java.util.*;
class Ladder
{
    public static void main(String args[] ) 
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        i=1;
        System.out.println("*   *");
        System.out.println("*   *");
        do
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            i++;
        }while(i<=n);
        sc.close();
    }
}
