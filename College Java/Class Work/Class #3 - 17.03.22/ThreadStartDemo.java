public class ThreadStartDemo 
{

    public void Start()
    {
        System.out.println("Start Method");
    }

    public void run()
    {
        System.out.println("Run Method");
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
    }

}

//If start method is overridden, Start will execute followed by main, but run will not be executed.
//Under normal start methode, run is called.
//Therefore, Thread Prioirtu is given to Start()


