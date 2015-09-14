public class SimpleRunnableThread implements Runnable {
 
    @Override
    public void run() {
 
        System.out.println("SimpleRunnableThread is starting");
        for (int i = 1; i <=20; i++) {
             
             
            //1 second delay code 
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("SimpleRunnableThread will run for "+ (20-i) +" more seconds");
        }
        System.out.println("SimpleRunnableThread is stopping");
 
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
         
        SimpleRunnableThread runnableThread = new SimpleRunnableThread();
         
        Thread t1 = new Thread(runnableThread);
 
        System.out.println("starting t1");
        t1.start();
        System.out.println("exiting main ");
    }
 
}
