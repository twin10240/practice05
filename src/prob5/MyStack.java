package prob5;

public class MyStack {
	private Object[] arr;
	private int top;
	private int size;
	
	public MyStack() {}

	public MyStack(int size) {
		this.size = size;
		this.top = -1;
		this.arr = new String[size];
	}

	public Object[] getArr() {
		return arr;
	}

	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void push(String str) {
		arr[++top] = str;
	}

	public boolean isEmpty() {
		return getTop() < 0 ? true : false;
	}

	public String pop() throws MyStackException {
		String val = "";

		if (getTop() < 0) {
			throw new MyStackException("Stack is empty");
		}else{
			val = (String)arr[top--];
		}
		
		return val;
	}

}
