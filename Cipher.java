import java.util.*;
public class Cipher
{
	 public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
	    String s,s1="";
	    int l,i,k,t,k1;
	    char ch,ch1;
	    s=sc.nextLine();
	    k=sc.nextInt();
	    k1=k%10;
	    k=k%26;
	    l=s.length();
	    for(i=0;i<l;i++)
	    {
	       ch=s.charAt(i);
	       if((int)ch>=65&&(int)ch<=90)
	       {
	           ch=(char)((int)ch+k);
	           if((int)ch<=90)
	           {
	            	s1=s1+ch;	
	           }
	           else
	           {
	        	   t=64+((int)ch)-90;
	        	   ch1=(char)t;
	        	   s1=s1+ch1;
	           }
	        }
	       else if((int)ch>=97&&(int)ch<=122)
	       {
	    	   ch=(char)((int)ch+k);
	    	   if((int)ch<=122)
	           {
	            	s1=s1+ch;	
	           }
	           else
	           {
	        	   t=96+((int)ch)-122;
	        	   ch1=(char)t;
	        	   s1=s1+ch1;
	           }
	       }
	       else if((int)ch>=48&&(int)ch<=57)
	       {
	    	   ch=(char)((int)ch+k1);
	    	   if((int)ch<=57)
	           {
	            	s1=s1+ch;	
	           }
	           else
	           {
	        	   t=47+((int)ch)-57;
	        	   ch1=(char)t;
	        	   s1=s1+ch1;
	           }
	       }
	       else
	       {
	    	   s1=s1+ch;
	       }
	     }
	    System.out.println(s1);
	    sc.close();
	 }
}
