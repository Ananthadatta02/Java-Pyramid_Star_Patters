package star_patterns;

import java.util.Scanner;

/*
   *
  ***
 *****
*******
 */
public class PyramidStars 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = s.nextInt();
		int space = size-1;
		int star = 1;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			space--;
			star += 2;
			System.out.println();
		}
	}
}
