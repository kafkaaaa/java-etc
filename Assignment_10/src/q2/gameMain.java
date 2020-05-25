package q2;

public class gameMain {

	public static void main(String[] args) {
		
		Player p1 = new Player("황기태");
		Player p2 = new Player("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		p1.playGame();	// Player1 게임 실행
		p2.playGame();	// Player2 게임 실행
		
		p1.showResult();	// Player1 게임 결과 출력 
		p2.showResult();	// Player1 게임 결과 출력
		
		int time1 = p1.getPassedTime();	// Player1의 경과 시간
		int time2 = p2.getPassedTime();	// Player2의 경과 시간
		
		// Player1의 경과 시간이 10초와 더 가까우면 p1 승리
		if (Math.abs(10 - time1) < Math.abs(10 - time2)) {
			System.out.println("승자는 " + p1.name);
		}
		
		// Player2의 경과 시간이 10초와 더 가까우면 p2 승리
		else if (Math.abs(10 - time1) > Math.abs(10 - time2)) {
			System.out.println("승자는 " + p2.name);
		}
		
		// 나머지 경우 (두 플레이어의 경과 시간이 동일한 경우)
		else {
			System.out.println("비겼습니다.");
		}
		
	}

}
