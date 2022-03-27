 

public class DaemonThreads extends Thread 
{
    public void run()
    {
        System.out.println("Is it a Daemon Thread??? "+ Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        DaemonThreads d1 = new DaemonThreads();
        d1.setDaemon(true);
        d1.start();
        System.out.println("Thread Status: "+ Thread.currentThread().isDaemon());

        System.out.println("Daemon Thread has been started!");
        
    }
}

//Daemon Threads do not necessarily execute all statements.
//Provide Srevice to user threads.
//Gives an exception (IllegalThreadException) when thread is started before being initialised to Daemon
//Terminated by JVM at any time.
