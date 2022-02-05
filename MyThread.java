package p;

import java.util.concurrent.RunnableFuture;

/*If you extend thread class then you ar not able to
* extend other class*/
//public class MyThread extends Thread {
    public class MyThread implements Runnable {
     @Override
  //  public void run() {
   // synchronized only allow one thread at a time
      public synchronized void run() {

             for(int i=0; i<3;i++) {
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("Thread is :" + Thread.currentThread().getName() + " Value is " + i);
}
     }

    public static void main(String[] args) {
         MyThread obj = new MyThread();
        //MyThread t = new MyThread();  //If you extends Thread then need not to create thread
 //Here we created hread bcoz we are implement

        Thread t = new Thread(obj);
        t.setName("A");
        Thread t1 = new Thread(obj);
        t1.setName("B");
        t.start();
        t1.start();
    }
}
