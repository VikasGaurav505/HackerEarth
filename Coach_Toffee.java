import java.util.*;
public class Toffees 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		long d,count=0,i;
		double x,r,cap,circum;
		//System.out.println("Enter the number of days");
		d=sc.nextLong();
		for(i=0;i<d;i++)
		{
			//System.out.println("Enter the radius of the circle and the amount of the horlicks");
			r=sc.nextDouble();
			x=sc.nextDouble();
			cap=100*x;
			circum=(2*22*r)/7;
            if(circum<=cap)
            	count++;
		}
		System.out.println(count);
				sc.close();
	}
}
