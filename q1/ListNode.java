package q1;

//���� ����Ʈ�� �̿��� ���׽��� ǥ�� �� ���

public class ListNode {
	int coef;	// ���
	int expon;	// ����
	ListNode link;	// ���� ���� ����Ű�� link
	
	public ListNode() {
		link = null;
	}
	
	public ListNode(int coef, int expon) {
		this.coef = coef;
		this.expon = expon;
		this.link = null;
	}
}
