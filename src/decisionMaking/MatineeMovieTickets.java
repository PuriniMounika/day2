package decisionMaking;
import java.util.Scanner;

public class MatineeMovieTickets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		System.out.println("Enter show timing");
		float b=sc.nextFloat();
		float t=13.30f;
		if(b==t)
		{
			if(a>13)
				System.out.println("the ticket price is $5.00");
			else
				System.out.println("the ticketprice is $2.00");
			
		}
		else
		{
			if(a>13)
				System.out.println("the ticket price is $8.00");
			
			else 
				
				System.out.println("the ticket price is $4.00");
			
		}

	}

}
