
public class MyStack {
	
	private int max, i;
	private int[] stack;
	
	public MyStack(int max) {
		i = -1;
		this.max = max;
		stack = new int[max];
	}
	
	public int getLastIndex() {
		return i;
	}
	
	public synchronized void push(int value) {
		if(i < max-1)
			stack[++i] = value;
	}
	
	public synchronized int pop() {
		return stack[i--];
	}
}
