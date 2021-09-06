package decisionMaking;
import java.util.Scanner;

public class vowelorconsonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowel");
		}
		else if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
		{
			System.out.println("consonants");
		}
		else
		{
			System.out.println("Not a Alphabet");
		}

	}

}
