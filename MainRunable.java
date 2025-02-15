class MyTask implements Runnable {
    public void run() {
        System.out.println("Runnable");
    }
}

public class MainRunable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask()); 
        t.start(); 
    }
}
