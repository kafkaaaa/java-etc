package q1;

class Polynomial {
	ListNode head;	// ù��° ���� ����Ű�� head
	ListNode tail;	// ������ ���� ����Ű�� tail
	
	Polynomial() {	// �ʱ�ȭ
		head = null;
		tail = null;
	}
	
	void insertNode(int coef, int expon) {
		ListNode newNode = new ListNode(coef, expon);
		if (head == null) {		// ó�� �����̸�
			head = newNode;
			tail = newNode;
		}
		else {	// ���� ����.. tail�� ����
			tail.link = newNode;
			tail = newNode;
		}
	}
	
	// ���׽� ���
	void printPoly() {
		if (head == null && tail == null) {
			System.out.println("���� ���� �Դϴ�");
			System.exit(1);
		}
		else {
			while(head != tail) {
				System.out.print(head.coef + "x^" + head.expon + " + ");
				head = head.link;
			}
			// ������ ��� ���!
			System.out.print(tail.coef + "x^" + tail.expon + "\n");
		}
	}
	
}

