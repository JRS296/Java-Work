public class ThreadPriority extends Thread 
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Child Thread"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
        
    }
    public static void main(String[] args) 
    {
        ThreadPriority tp = new ThreadPriority();
        
        tp.setPriority(10); //Child Thread Priority has been set

        tp.start();

        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}

//Default thread priority of main thread is 5
