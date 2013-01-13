
public class Popper implements Runnable{
	
	private MyStack stack;
	private int value;
	
	public Popper(MyStack stack) {
		this.stack = stack;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public void run() {
		if(stack.getLastIndex() >= 0)
		{
			value = stack.pop();
			System.out.println("Popper called pop; Popped: " + value + " at index: " + (stack.getLastIndex()+1));
		}
	}
}
