public class joinDemo extends Thread {

    public void run() {

    }

    public static void main (String[] args) {
        joinDemo t1 = new joinDemo();
        joinDemo t2 = new joinDemo();
        joinDemo t3 = new joinDemo();

        throws InterruptedException
        {
            t1.start();
            t1.join(); //No contxt swirching with join
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        
    }
}
