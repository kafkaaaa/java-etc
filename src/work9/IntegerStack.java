package work9;

public class IntegerStack implements Stack {
	
	// "Please input 10 elements."
	final static int MAX_STACK_SIZE = 10;
	
	int stack[];
	int top;
	
	public IntegerStack() {
		stack = new int[MAX_STACK_SIZE];
		top = -1;
	}
	
	@Override
	public int length() {	// stack의 크기 반환
		return stack.length;
	}

	@Override
	public Object pop() {	// 삭제
		if (top == -1)
			return "스택이 공백상태 입니다.";
		else return stack[top--];
	}

	@Override
	public boolean push(Object ob) {	// 삽입
		if (top == stack.length-1)
			return false;	// 스택 포화
		else {
			stack[++top] = (int) ob;
			return true;
		}
	}

}
