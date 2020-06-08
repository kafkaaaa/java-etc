package q1;

import java.util.*;

class PointManager {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);
	
	void run() {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scan.next();

			if (name.equals("그만"))
				break;
		
			int point = scan.nextInt();
			
			if ( !hm.containsKey(name) ) {		// 등록된 이름이 없으면..
				hm.put(name, point);
			}
			else {		// 기존 회원이면 포인트 누적
				point += hm.get(name);
				hm.put(name, point);
			}
			
			printMap();	// 해시맵 출력
		}
	}
	
	void printMap() {
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int point = hm.get(name);
			System.out.print("(" + name + "," + point + ")");
		}
		System.out.print("\n");
	}
	
}
