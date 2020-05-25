package q2;

import java.util.Calendar;	// ���� ��¥�� �ð��� ���� ������ ���� Calendar
import java.util.Scanner;

class Player {
	Scanner scan = new Scanner(System.in);
	
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	int sec1, sec2;
	
	void playGame() {
		System.out.print(name + " ���� <Enter>Ű>>");
		String inputEnter = scan.nextLine();	// EnterŰ �Է� (ù��°)
		
		Calendar cal1 = Calendar.getInstance();
		sec1 = cal1.get(Calendar.SECOND);	// enterŰ �Է� �� ���� �ð�
		System.out.println("\t���� �� �ð� = " + sec1);
		
		System.out.print("10�� ���� �� <Enter>Ű>>");
		inputEnter = scan.nextLine();	// EnterŰ �Է� (�ι�°)
		
		Calendar cal2 = Calendar.getInstance();
		sec2 = cal2.get(Calendar.SECOND);	// enterŰ �Է� �� ���� �ð�
		System.out.println("\t���� �� �ð� = " + sec2);
	}
	
	void showResult() {
		System.out.print(name + "�� ��� " + getPassedTime() + ", ");
	}
	
	// ����� �ð��� return
	int getPassedTime() {
		if (sec1 <= sec2)
			return sec2 - sec1;
		else
			return 60 - Math.abs(sec2 - sec1);
	}
	
}
