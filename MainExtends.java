class MyThread extends Thread {
    public void run() {
        System.out.println("Extend ");
    }
}

public class MainExtends {
    public static void main(String[] args) {
        MyThread t = new MyThread(); 
        t.start(); 
    }
}
