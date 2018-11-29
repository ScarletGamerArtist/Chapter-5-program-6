package AlannaBotscharowCh5pr5;
import java.util.Scanner;

public class SimplifiedChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num = input.nextInt(); 
		
		System.out.println((char)num);
		
		
		char letter = input.next().charAt(0);
		
		System.out.println((int)letter);
		
	}

}
