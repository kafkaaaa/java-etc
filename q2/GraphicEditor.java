package q2;

import java.util.*;

class GraphicEditor {
	Vector<Shape> v = new Vector<Shape>();
	Scanner scan = new Scanner(System.in);
	
	void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			
			int select = scan.nextInt();
			int num;
			
			switch(select) {
			// ����(1)
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
					System.out.println("�Է� ����");
				break;
				
			// ����(2)
			case 2:
				System.out.print("������ ������ ��ġ >> ");
				num = scan.nextInt();
				// ���Ͱ� ����ְų� �����Ϸ��� ��ġ�� ��������� ���� �Ұ�
				if (v.isEmpty() || v.size() <= num)
					System.out.println("������ �� �����ϴ�.");
				else
					v.remove(num);
				break;
			
			// ��� ����(3)
			case 3:
				for (int i=0; i<v.size(); i++) {
					v.get(i).draw();
				}
				break;
			
			// ����(4)
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				return;
				
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
}
