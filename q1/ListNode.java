package q1;

//연결 리스트를 이용한 다항식의 표현 및 출력

public class ListNode {
	int coef;	// 계수
	int expon;	// 지수
	ListNode link;	// 다음 항을 가리키는 link
	
	public ListNode() {
		link = null;
	}
	
	public ListNode(int coef, int expon) {
		this.coef = coef;
		this.expon = expon;
		this.link = null;
	}
}
