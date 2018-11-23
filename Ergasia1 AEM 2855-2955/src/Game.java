import java.util.ArrayList;
import java.util.Collections;

public class Game {
	
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<String> hiden = new ArrayList<String>();
	
	public void InitializeGame() {
		
		 for(int  i=0; i<24; i++)
			 hiden.add("X");
		 for(int i=0; i<12; i++) {
			 numbers.add(i);
			 numbers.add(i);			 
		 }	
		 Collections.shuffle(numbers);
	}
	
	public void Swap(int n1, int n2) {
		
		int x,y;
		
		x = numbers.get(n1);
		y = numbers.get(n2);
		
		if(x==y) {
			hiden.set(n1, Integer.toString(x));
			hiden.set(n2, Integer.toString(x));		
			System.out.println("Correct.");
		}
		else
			System.out.println("Wrong.");		
	}
	
	public boolean checkWin() {
		if(hiden.contains("X"))
			return false;
		return true;
	}
	
	public void Printwork() {
		
		
		for(int i=0; i<6; i++) {
			System.out.print(hiden.get(i)+" ");
				System.out.print(" ");
		}
		System.out.println("");
		
		for(int i=6; i<12; i++) {
			System.out.print(hiden.get(i)+" ");
				System.out.print(" ");
		}
		System.out.println("");
		
		for(int i=12; i<18; i++) {
			System.out.print(hiden.get(i)+" ");
				System.out.print(" ");
		}
		System.out.println("");
		
		for(int i=18; i<24; i++) {
			System.out.print(hiden.get(i)+" ");
				System.out.print(" ");
		}
	}
		
	
}
