package q2;

import java.util.Calendar;	// 현재 날짜와 시간에 대한 정보를 가진 Calendar
import java.util.Scanner;

class Player {
	Scanner scan = new Scanner(System.in);
	
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	int sec1, sec2;
	
	void playGame() {
		System.out.print(name + " 시작 <Enter>키>>");
		String inputEnter = scan.nextLine();	// Enter키 입력 (첫번째)
		
		Calendar cal1 = Calendar.getInstance();
		sec1 = cal1.get(Calendar.SECOND);	// enter키 입력 후 현재 시간
		System.out.println("\t현재 초 시간 = " + sec1);
		
		System.out.print("10초 예상 후 <Enter>키>>");
		inputEnter = scan.nextLine();	// Enter키 입력 (두번째)
		
		Calendar cal2 = Calendar.getInstance();
		sec2 = cal2.get(Calendar.SECOND);	// enter키 입력 후 현재 시간
		System.out.println("\t현재 초 시간 = " + sec2);
	}
	
	void showResult() {
		System.out.print(name + "의 결과 " + getPassedTime() + ", ");
	}
	
	// 경과된 시간을 return
	int getPassedTime() {
		if (sec1 <= sec2)
			return sec2 - sec1;
		else
			return 60 - Math.abs(sec2 - sec1);
	}
	
}
