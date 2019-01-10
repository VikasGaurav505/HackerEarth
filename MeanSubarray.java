import java.util.*;
public class MeanSubarray
{
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int l,r,i,n,q,temp;
	        n=sc.nextInt();
	        q=sc.nextInt();
	        int arr[]=new int[n];
	        for(i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        for(i=0;i<q;i++)
	        {
	            l=sc.nextInt();
	            r=sc.nextInt();
	            temp=(arr[l-1]+arr[r-1])/2;
	            System.out.println(temp);
	        }
	        sc.close();
	    }
}
