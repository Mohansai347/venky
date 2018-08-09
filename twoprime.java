import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
    {
    	 Scanner sc=new Scanner(System.in);
    	 int num1=sc.nextInt();
    	 int num2=sc.nextInt();
    	 int count,i;
    	 for(i=num1+1;i<num2;i++)
    	 {
    	 	count=0;
    	 	for(int j=1;j<=i;j++)
    	 	{
    	 		if(i%j==0)
    	 		 count=count+1;
    	 	}
    	 	 if(count==2)
    	   System.out.print(i+" ");
    	 }
	}
	
} 
