package decisionMaking;
import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		int e=scanner.nextInt();
		double t=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
		if(t<15000)
			System.out.println("Yes");
		else
			
			System.out.println("No");
	}

}
