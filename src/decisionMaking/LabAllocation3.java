package decisionMaking;
import java.util.Scanner;

public class LabAllocation3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the x:");
		int x=s.nextInt();
		System.out.println("Enter the y:");
		int y=s.nextInt();
		System.out.println("Enter the z:");
		int z=s.nextInt();
		System.out.println("Enter the n:");
		int n=s.nextInt();
		if(n<=x&&n<=y&&n<=z)
		{
			System.out.println("3 lab(s) can accommodate 25 students");
		
		}
		else if((n<=x&&n<=y)||(n<=x&&n<=z)||(n<=y&&n<=z))
		{
			System.out.println("2 lab(s) can accommodate 25 students");
			
		}
		else if(n<=x||n<=y||n<=z)
		{
			System.out.println("1 lab(s) can accommodate 25 students");
		
		}
		else
		{
			System.out.println("none of the  lab(s) can accommodate 25 students");
		
		}
		
		
		
		

	}

}
