public class StopwatchThread implements Runnable{

    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName){
        this.threadName = threadName;
        System.out.println("Thread is initialized");

    }

    @Override
    public void run() {
        try {
        for (int i=0;i<10;i++){
            System.out.println("Thread is working: "+threadName+" : "+i);

                Thread.sleep(1000);

        }
        } catch (InterruptedException e) {
           System.out.println("An error occurred: "+ e);
        }
        System.out.println("Thread finished: "+threadName);
    }

    public void start(){
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }else{
            thread.start();
        }

    }
}
