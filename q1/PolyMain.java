package q1;

import java.util.Scanner;

public class PolyMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Polynomial poly1 = new Polynomial();
		System.out.println("첫 번째 다항식을 입력하시오.");
		while(true) {
			// end가 입력되면 반복을 종료 하기 위해..
			// 입력받은 것을 String 클래스 타입의 input에 저장한 다음
			// end면 break;
			// 아니면 다시 숫자로 바꿔준다
			String input = scan.next();
			if ( input.equals("end") ) {
				break;
			}
			int coef = Integer.parseInt(input);
			int expon = scan.nextInt();
			poly1.insertNode(coef, expon);
		}
	
		Polynomial poly2 = new Polynomial();
		System.out.println("두 번째 다항식을 입력하시오.");
		while(true) {
			String input = scan.next();
			if ( input.equals("end") ) {
				break;
			}
			int coef = Integer.parseInt(input);
			int expon = scan.nextInt();
			poly2.insertNode(coef, expon);
		}
		scan.close();
		
		Polynomial result = addPoly(poly1, poly2);
		result.printPoly();
	}
	
	
	static Polynomial addPoly(Polynomial poly1, Polynomial poly2) {
		Polynomial result = new Polynomial();	// add 결과를 저장할 다항식 result
		ListNode a = poly1.head;
		ListNode b = poly2.head;
		
		// a나 b중 하나가 먼저 끝나게 되면 남아있는 항들을 모두 result로
		while(a!=null && b!= null) {
			if (a.expon == b.expon) {	// a의 차수(지수) == b의 차수
				int sum = a.coef + b.coef;
				if (sum != 0) {
					result.insertNode(sum, a.expon);
				}
				a=a.link;
				b=b.link;
			}
			else if (a.expon > b.expon) {	// a의 차수 > b의 차수
				result.insertNode(a.coef, a.expon);
				a=a.link;
			}
			else {	// a의 차수 < b의 차수
				result.insertNode(b.coef, b.expon);
				b=b.link;
			}
		}
		for ( ; a != null; a=a.link) {
			result.insertNode(a.coef, a.expon);
		}
		
		for ( ; b != null; b=b.link) {
			result.insertNode(b.coef, b.expon);
		}
		
		return result;
	}
	
}
