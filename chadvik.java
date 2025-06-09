class Mythread extends Thread {

   public void run() {
      for (int i = 0; i < 5; i++) {
         System.out.println(Thread.currentThread().getName() + "Count " + i);
         try {
            Thread.sleep(i);
         } catch (InterruptedException e) {
            System.out.println("We catch the Exception");
         }
      }

   }

   public class chadvik {
      public static void main(String[] args) {
         Mythread thread1 = new Mythread();
         Mythread thread2 = new Mythread();
         thread1.start();
         thread2.start();

      }
   }
}

// public static void main(String[] args) {
// neutron obj = new neutron();
// System.out.println("The thread is print here");
// obj.start();

// }

// public void run() {
// System.out.println("This is the inside message of the Thread");
// }
