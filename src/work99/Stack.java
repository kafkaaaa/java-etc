package work99;

interface Stack {
	boolean isEmpty();
	void push(Object data);	// 삽입
	Object pop();			// 삭제
	Object peek();			// 피크
	void printStack();		// 출력
}
