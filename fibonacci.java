//PROGRAM NO:2 write a java program to calculate fibonacci series up to n number
import java.util.*;
import java.io.*;
class fibonacci
{
	public static void main(String args[])
	{
		int next_Term,n=10,first_Term=0,Second_Term=1;
		System.out.println("Fibonacci Series "+n+"Terms:");
		for(int i=1;i<=n;++i)
		{
			System.out.println(first_Term+"\t");
			next_Term=first_Term+Second_Term;
			first_Term=Second_Term;
			Second_Term=next_Term;
		}
	}
}