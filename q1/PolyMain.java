package q1;

import java.util.Scanner;

public class PolyMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Polynomial poly1 = new Polynomial();
		System.out.println("ù ��° ���׽��� �Է��Ͻÿ�.");
		while(true) {
			// end�� �ԷµǸ� �ݺ��� ���� �ϱ� ����..
			// �Է¹��� ���� String Ŭ���� Ÿ���� input�� ������ ����
			// end�� break;
			// �ƴϸ� �ٽ� ���ڷ� �ٲ��ش�
			String input = scan.next();
			if ( input.equals("end") ) {
				break;
			}
			int coef = Integer.parseInt(input);
			int expon = scan.nextInt();
			poly1.insertNode(coef, expon);
		}
	
		Polynomial poly2 = new Polynomial();
		System.out.println("�� ��° ���׽��� �Է��Ͻÿ�.");
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
		Polynomial result = new Polynomial();	// add ����� ������ ���׽� result
		ListNode a = poly1.head;
		ListNode b = poly2.head;
		
		// a�� b�� �ϳ��� ���� ������ �Ǹ� �����ִ� �׵��� ��� result��
		while(a!=null && b!= null) {
			if (a.expon == b.expon) {	// a�� ����(����) == b�� ����
				int sum = a.coef + b.coef;
				if (sum != 0) {
					result.insertNode(sum, a.expon);
				}
				a=a.link;
				b=b.link;
			}
			else if (a.expon > b.expon) {	// a�� ���� > b�� ����
				result.insertNode(a.coef, a.expon);
				a=a.link;
			}
			else {	// a�� ���� < b�� ����
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
