package q2;

import java.util.*;

class GraphicEditor {
	Vector<Shape> v = new Vector<Shape>();
	Scanner scan = new Scanner(System.in);
	
	void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			
			int select = scan.nextInt();
			int num;
			
			switch(select) {
			// 삽입(1)
			case 1 :
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				num = scan.nextInt();
				if (num == 1) {
					Shape s = new Line();
					v.add(s);
				}
				else if (num == 2) {
					Shape s = new Rect();
					v.add(s);
				}
				else if (num == 3) {
					Shape s = new Circle();
					v.add(s);
				}
				else
					System.out.println("입력 오류");
				break;
				
			// 삭제(2)
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				num = scan.nextInt();
				// 벡터가 비어있거나 삭제하려는 위치가 비어있으면 삭제 불가
				if (v.isEmpty() || v.size() <= num)
					System.out.println("삭제할 수 없습니다.");
				else
					v.remove(num);
				break;
			
			// 모두 보기(3)
			case 3:
				for (int i=0; i<v.size(); i++) {
					v.get(i).draw();
				}
				break;
			
			// 종료(4)
			case 4:
				System.out.println("beauty를 종료합니다.");
				return;
				
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
}
