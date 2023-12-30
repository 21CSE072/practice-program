class PrintNumbers implements Runnable {
    private int n;
    private static Object lock = new Object();
    private static int count = 1;

    public PrintNumbers(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        synchronized (lock) {
            while (count <= n) {
                System.out.println(count++);
                lock.notify(); 
                try {
                    if (count <= n) {
                        lock.wait(); 
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int N = 10;
        PrintNumbers printNumbers = new PrintNumbers(N);
        Thread t1 = new Thread(printNumbers);
        Thread t2 = new Thread(printNumbers);
        t1.start();
        t2.start();
    }
}
