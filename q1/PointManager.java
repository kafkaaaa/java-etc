package q1;

import java.util.*;

class PointManager {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);
	
	void run() {
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scan.next();

			if (name.equals("�׸�"))
				break;
		
			int point = scan.nextInt();
			
			if ( !hm.containsKey(name) ) {		// ��ϵ� �̸��� ������..
				hm.put(name, point);
			}
			else {		// ���� ȸ���̸� ����Ʈ ����
				point += hm.get(name);
				hm.put(name, point);
			}
			
			printMap();	// �ؽø� ���
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
