import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter your budget");
		int budget =sc.nextInt();
		
		
		boolean exitloop=true;
		while(exitloop){
			int d = 0;
			
			System.out.println("enter your choice ");
			System.out.println("1 add an item");
			System.out.println("2 exit");
			Scanner c=new Scanner(System.in);
			int i=c.nextInt();
			
			
			
		switch(i)
		{
		
		
		case 1:
			
		System.out.println("enter product, quantity,amount");
		Scanner b=new Scanner(System.in);
		Scanner e=new Scanner(System.in);
		int quantity=b. nextInt(); 
		int price=b.nextInt();
		
		char product=e.next().charAt(0);
		
		int amount =quantity*price;
		System.out.println(amount);
		budget=budget-amount;
		if(price<=budget)
			System.out.println(  "your budget is="+budget);
		
			else
			{
			System.out.println("budget out  ");
		}
		
		 
		
		
		break;
		
		case 2: exitloop=false;
		
		
		}
			
		
		
		}
		
		System.out.println("u r exit");
		}
		
    
	
	
	
	}
	
	


