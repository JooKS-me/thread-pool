package cn.zks;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhukunshuai
 */
public class Main {

    public static void main(String[] args) {
        MyTask t1 = new MyTask("1");
        MyTask t2 = new MyTask("2");
        MyTask t3 = new MyTask("3");
        MyTask t4 = new MyTask("4");
        MyTask t5 = new MyTask("5");
        MyTask t6 = new MyTask("6");
        MyTask t7 = new MyTask("7");
        MyTask t8 = new MyTask("8");

        MyThreadPool myThreadPool = new MyThreadPool(4, new LinkedBlockingQueue<>());

        myThreadPool.execute(t1);
        myThreadPool.execute(t2);
        myThreadPool.execute(t3);
        myThreadPool.execute(t4);
        myThreadPool.execute(t5);
        myThreadPool.execute(t6);
        myThreadPool.execute(t7);
        myThreadPool.execute(t8);
    }
}
