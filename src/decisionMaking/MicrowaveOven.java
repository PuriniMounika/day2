package decisionMaking;
import java.util.Scanner;

public class MicrowaveOven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int a=sc.nextInt();
		System.out.println("Enter the single item heating time:");
		float f=sc.nextFloat();
		
		switch(a)
		{
		case 1:
			
			System.out.printf("the recommended heating time is %.1f", f);
			break;
		case 2:
			double t=(1.5)*f;
			System.out.printf("the recommended heating time is%.1f" , t);
			break;
			
		default:
			System.out.printf("number of items is more");
			break;
		}

	}

}
