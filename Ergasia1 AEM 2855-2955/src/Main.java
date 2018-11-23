import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Game test = new Game();
		
		test.InitializeGame();
		test.Printwork();
		int tries = 0;
		Scanner reader = new Scanner(System.in);

		
		do {
			System.out.println("\n");
			System.out.println("Enter a number between 0 and 23: ");
			int	c1 = reader.nextInt();
			while(!(c1 > 0 && c1 < 23)) {
				System.out.println("Choose another number from 0 to 23");
				c1 = reader.nextInt();
			}
			System.out.println("Enter a different number between 0 and 23: ");
			int c2 = reader.nextInt();
			while(!(c2 > 0 && c2 < 23)) {
				System.out.println("Choose another number from 0 to 23");
				c2 = reader.nextInt();
			}			
			while(c1==c2) {
				System.out.println("\n");
				System.out.println("Enter a number between 0 and 23: ");
				c1 = reader.nextInt();
				while(!(c1 > 0 && c1 < 23)) {
					System.out.println("Choose another number from 0 to 23");
					c1 = reader.nextInt();
				}
				System.out.println("Enter a different number between 0 and 23: ");
				c2 = reader.nextInt();
				while(!(c2 > 0 && c2 < 23)) {
					System.out.println("Choose another number from 0 to 23");
					c2 = reader.nextInt();
				}
			}

			test.Swap(c1, c2);
			test.Printwork();
			tries++;

			
		}while(test.checkWin()==false);
		
		
		System.out.println("Tries: " + tries);

	}

}
