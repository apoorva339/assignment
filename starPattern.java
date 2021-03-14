import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=65;
		System.out.println("** printing the alphabet ");
		for (int i=0;i<=5; i++)
			
		{
			
			for(int j =0; j<=i; j++)
			{
				System.out.print( (char)  c  +"");
				
			}
			
			c++;
			System.out.println();
			
		}
	}

}
