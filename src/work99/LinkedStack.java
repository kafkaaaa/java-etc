package work99;

import java.util.EmptyStackException;

class LinkedStack implements Stack {
	
	private StackNode top;
	
	LinkedStack() {
		this.top = null;
	}
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(Object data) {
		StackNode newNode = new StackNode(data);
		newNode.link = top;
		top = newNode;
	}

	@Override
	public Object pop() {
		if ( isEmpty() ) {
			System.out.println("스택 공백 에러");
			throw new EmptyStackException();
		}
		StackNode temp = top;
		Object data = temp.data;
		top = top.link;
		temp.link = null;
		return data;
	}

	@Override
	public Object peek() {
		if ( isEmpty() ) {
			System.out.println("스택 공백 에러");
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	@Override
	public void printStack() {
		System.out.println("-----stack------");
		while( isEmpty() != true ) {
			System.out.println( peek() );
			pop();
		}
	}

}
