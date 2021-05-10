import java.util.PriorityQueue;
import java.util.Random;

public class CarQueue {
    Random random = new Random();
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    private int out;

    public CarQueue() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(0);
        queue.add(2);
        queue.add(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(0);
        queue.add(2);
        queue.add(4);
    }

    public void addToQueue() {
        class Run implements Runnable {
            public void run() {
                try {
                    int ran = random.nextInt(3);
                    queue.add(ran);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                }
            }
        }
        Runnable r = new Run();
        Thread t = new Thread(r);
        t.start();
    }
    public int deleteQueue() {
        if(queue.isEmpty()) {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(1);
            queue.add(0);
            queue.add(2);
            queue.add(4);
        }
        return queue.remove();
    }
}