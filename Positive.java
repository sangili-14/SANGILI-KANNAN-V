import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("zero");
		}
		else if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		
		
	}
}
