package q2;

public class gameMain {

	public static void main(String[] args) {
		
		Player p1 = new Player("Ȳ����");
		Player p2 = new Player("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		p1.playGame();	// Player1 ���� ����
		p2.playGame();	// Player2 ���� ����
		
		p1.showResult();	// Player1 ���� ��� ��� 
		p2.showResult();	// Player1 ���� ��� ���
		
		int time1 = p1.getPassedTime();	// Player1�� ��� �ð�
		int time2 = p2.getPassedTime();	// Player2�� ��� �ð�
		
		// Player1�� ��� �ð��� 10�ʿ� �� ������ p1 �¸�
		if (Math.abs(10 - time1) < Math.abs(10 - time2)) {
			System.out.println("���ڴ� " + p1.name);
		}
		
		// Player2�� ��� �ð��� 10�ʿ� �� ������ p2 �¸�
		else if (Math.abs(10 - time1) > Math.abs(10 - time2)) {
			System.out.println("���ڴ� " + p2.name);
		}
		
		// ������ ��� (�� �÷��̾��� ��� �ð��� ������ ���)
		else {
			System.out.println("�����ϴ�.");
		}
		
	}

}
