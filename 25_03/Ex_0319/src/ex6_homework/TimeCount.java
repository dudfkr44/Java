package ex6_homework;

public class TimeCount extends Thread {
   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(3000);
            Ex1_homework.addlist();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
