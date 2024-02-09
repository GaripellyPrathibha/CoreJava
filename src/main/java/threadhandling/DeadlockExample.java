package threadhandling;
public class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "printer";
        final String resource2 = "scanner";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locking resource 1");
                    try {
                        Thread.sleep(100);
                    }
                    catch (Exception e)
                    {}
                    synchronized (resource2) {
                        System.out.println("Thread 1: locking resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locking resource 2");
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (Exception e)
                    {}
                    synchronized (resource1) {
                        System.out.println("Thread 2: locking resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}

