package work99;

import java.util.Scanner;

public class LinkedStackMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedStack stack1 = new LinkedStack();

		stack1.push(scan.next());
		stack1.push(scan.next());
		stack1.push(scan.nextInt());
		
		stack1.printStack();
		
		scan.close();

	}

}
