package decisionMaking;
import java.util.Scanner;

public class LabAllocation4 {

	public static void main(String[] args) {
		int L1,L2,L3,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the x:");
		L1=s.nextInt();
		System.out.println("Enter the y:");
		L2=s.nextInt();
		System.out.println("Enter the z:");
		L3=s.nextInt();
		System.out.println("Enter the n:");
		n=s.nextInt();
		if(n<L1&&n<L2&&n<L3)
		{
			if(L1<L2&&11<L3)
			
				System.out.println("L1 should be allocated to this class");
			
				else if(L2<L3)
					System.out.println("L2 should be allocated to this class");
				
				else
					System.out.println("L3 should be allocated to this class");
			}
			else if(n<L1&&n<L2)
			{
				if(L1<L2)
					System.out.println("L1 should be allocated to this class");
				
				else
					
					System.out.println("L2 should be allocated to this class");
				
			}
			else if(n<L1&&n<L3)
			{
				if(L1<L3)
					System.out.println("L1 should be allocated to this class");
				
				else
					System.out.println("L3 should be allocated to this class");
				
			}
			else if(n<L2&&n<L3)
			{
				if(L2<L3)
					
					System.out.println("L2 should be allocated to this class");
				
				else
					
					System.out.println("L3 should be allocated to this class");
				
			}
			else if(n<L1)
				System.out.println("L1 should be allocated to this class");
			else if(n<L2)
				System.out.println("L2 should be allocated to this class");
			else if(n<L3)
				System.out.println("L3 should be allocated to this class");
			else
				
				System.out.println("none of the labs can be  allocated ");
					
			
		
		
}

}
