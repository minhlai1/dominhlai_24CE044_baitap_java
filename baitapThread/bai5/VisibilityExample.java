package bai5;

public class VisibilityExample {
    private static volatile boolean flag = false;
 public static void main(String[] args) {
 new Thread(() -> {
 while (!flag) {}
 System.out.println("Flag changed!");
 }).start();
 try { Thread.sleep(2000); } catch (InterruptedException e) {}
 flag = true;
 }
}

