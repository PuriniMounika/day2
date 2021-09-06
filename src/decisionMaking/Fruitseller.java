package decisionMaking;
import java.util.Scanner;

public class Fruitseller {

	public static void main(String[] args) {
		System.out.println("Enter the price of dozen mangoes:");
		System.out.println("Enter the cost of price:");
		System.out.println("Enter the selling price:");
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(b-c>0)
		{
			System.out.println("loss Rs:"+(b+c));
		}
		else if(b-c<0)
		{
			System.out.println("proift Rs:"+(c-b));
		}
		else
		{
			System.out.println("No profit No loss");
		}
		

	}

}
