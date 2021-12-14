package cn.zks;

/**
 * @author zhukunshuai
 */
public class MyTask implements Runnable {

    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task-" + taskName + " is executed...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task-" + taskName + " is finished...");
    }
}
