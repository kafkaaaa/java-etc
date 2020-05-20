package work9;

import java.util.*;

public class ExerMain {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		Stack stack = new StringStack();
		Stack stack = new IntegerStack();
		
		System.out.println("Please input 10 elements.");
		for (int i=0; i<stack.length(); i++) {
//			if (stack.push(s.next()) == false) break;
			if (stack.push(s.nextInt()) == false) break;
		}
		
		System.out.println("Full stack. Now start 'pop'");
		for (int i=0; i<stack.length(); i++) {
			System.out.print(stack.pop() + " ");
		}
		s.close();

	}

}
