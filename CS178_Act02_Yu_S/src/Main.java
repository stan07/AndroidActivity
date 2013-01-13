import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(20);
		List<Thread> threads = new ArrayList<Thread>();
		int count1=0, count2=0;
		
		for(int i=0; i<20; i++)
		{
			if(count1 < 10)
			{
				Runnable task1 = new Pusher(stack, 1, count1);
				Thread worker1 = new Thread(task1);
				worker1.start();
				threads.add(worker1);
				count1++;
			}
			
			if(count2 < 10)
			{
				Runnable task2 = new Pusher(stack, 2, count2);
				Thread worker2 = new Thread(task2);
				worker2.start();
				threads.add(worker2);
				count2++;
			}
			
			Runnable task3 = new Popper(stack);
			Thread worker3 = new Thread(task3);
			worker3.start();
			threads.add(worker3);
		}
	}
}
