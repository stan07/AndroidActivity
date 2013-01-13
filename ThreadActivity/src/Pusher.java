
public class Pusher implements Runnable{
	
	private MyStack stack;
	private int count, threadnum;
	
	public Pusher(MyStack stack, int threadnum, int count) {
		this.stack = stack;
		this.threadnum = threadnum;
		this.count = count;
	}
	
	@Override
	public void run() {
			stack.push(count);
			System.out.println("Pusher: " + threadnum + " called push; Pushed: " + count + " at index: " + stack.getLastIndex());
	}
}
