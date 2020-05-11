package q1;

class Polynomial {
	ListNode head;	// 첫번째 항을 가리키는 head
	ListNode tail;	// 마지막 항을 가리키는 tail
	
	Polynomial() {	// 초기화
		head = null;
		tail = null;
	}
	
	void insertNode(int coef, int expon) {
		ListNode newNode = new ListNode(coef, expon);
		if (head == null) {		// 처음 삽입이면
			head = newNode;
			tail = newNode;
		}
		else {	// 끝에 삽입.. tail을 갱신
			tail.link = newNode;
			tail = newNode;
		}
	}
	
	// 다항식 출력
	void printPoly() {
		if (head == null && tail == null) {
			System.out.println("공백 상태 입니다");
			System.exit(1);
		}
		else {
			while(head != tail) {
				System.out.print(head.coef + "x^" + head.expon + " + ");
				head = head.link;
			}
			// 마지막 노드 출력!
			System.out.print(tail.coef + "x^" + tail.expon + "\n");
		}
	}
	
}

