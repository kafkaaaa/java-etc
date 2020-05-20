package work9;

public class StringStack implements Stack {
	
	// "Please input 10 elements."
	final static int MAX_STACK_SIZE = 10;
	
	String stack[];
	int top;
	
	public StringStack() {
		stack = new String[MAX_STACK_SIZE];
		top = -1;
	}
	
	@Override
	public int length() {	// stack�� ũ�� ��ȯ
		return stack.length;
	}

	@Override
	public Object pop() {	// ����
		if (top == -1)
			return "������ ������� �Դϴ�.";
		else return stack[top--];
	}

	@Override
	public boolean push(Object ob) {	// ����
		if (top == stack.length)
			return false;	// ���� ��ȭ
		else {
			stack[++top] = (String) ob;
			return true;
		}
	}
		
}
