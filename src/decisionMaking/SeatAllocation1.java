package decisionMaking;
import java.util.Scanner;

public class SeatAllocation1 {

	public static void main(String[] args) {
		int r,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		r=sc.nextInt();
		System.out.println("Enter the number of coloumns:");
		c=sc.nextInt();
		System.out.println("Enter the Roll number of students:");
		n=sc.nextInt();
		if((n<c)||(n%c==1)||(n%c==0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
