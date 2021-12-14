package cn.zks;

import java.util.Queue;

/**
 * @author zhukunshuai
 */
public class WorkerThread extends Thread {

    private Queue<Runnable> runnableQueue;

    public WorkerThread(Queue<Runnable> runnableQueue) {
        this.runnableQueue = runnableQueue;
    }

    @Override
    public void run() {
        while (true) {
            Runnable task = null;
            while (task == null) {
                task = runnableQueue.poll();

                if (task == null) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            task.run();
        }
    }
}
