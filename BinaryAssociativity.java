import java.util.*;
public class BianryAssociativity 
{
	    public static void main(String args[] ) throws Exception 
	    {
	        Scanner sc= new Scanner (System.in);
	        int t,i;
	        t=sc.nextInt();
	        sc.nextLine();
	        for(i=1;i<=t;i++)
	        {
	            String str=sc.nextLine();
	     
	            if(str.equals("0 1 1 0")||str.equals("0 1 1 1")||str.equals("0 0 0 1")||str.equals("1 0 0 1")||str.equals("1 1 1 1")||str.equals("0 0 0 0")||str.equals("0 0 1 1")||str.equals("0 1 0 1"))
	                System.out.println("Yes");
	            else
	                System.out.println("No");
	        }
	        
	    
	    sc.close();
	}
}
