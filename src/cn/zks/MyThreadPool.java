package cn.zks;

import java.util.Queue;

/**
 * @author zhukunshuai
 */
public class MyThreadPool {

    private int threadPoolSize;

    private Queue<Runnable> runnableDeque;

    private Thread[] threads;

    public MyThreadPool(int threadPoolSize, Queue<Runnable> runnableDeque) {
        this.threadPoolSize = threadPoolSize;
        this.runnableDeque = runnableDeque;
        threads = new Thread[threadPoolSize];
        for (int i = 0; i < threadPoolSize; i++) {
            threads[i] = new WorkerThread(runnableDeque);
            threads[i].start();
        }
    }

    /**
     * Execute task.
     *
     * @param task the task
     */
    public void execute(Runnable task) {
        runnableDeque.add(task);
    }
}
