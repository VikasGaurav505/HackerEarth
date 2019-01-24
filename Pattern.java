import java.util.*;
public class Pattern
{
	   public static void main(String args[] ) throws Exception
	    {
	        Scanner sc=new Scanner(System.in);
	        int n,i;
	        n=sc.nextInt();
	        long a[]=new long[n];
	        for(i=0;i<n;i++)
	        {
	            a[i]=sc.nextLong();
	        }
	        long max=a[0],min=a[0],sum=0;
	        for(i=0;i<n;i++)
	        {
	            if(a[i]>max)
	                max=a[i];
	            if(a[i]<min)
	                min=a[i];
	        }
	        sum = min+max;
	        System.out.println(sum);
	        sc.close();
	    }
	}

