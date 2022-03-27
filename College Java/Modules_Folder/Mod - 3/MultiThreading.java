public class MultiThreading {
    public static void main(String[] args) { //main - main thread
        System.out.println("Application Started");

        printer p = new printer();//Only one single object of printer
        //p.printDocument(10, "InshantsProfile.pdf"); 

        mythread mref = new mythread(p);//mref is a reference to object p of peinter whhich is passed down to constructor of mythread
        mythread2 yref = new mythread2(p);//Multiple threads working on the same printer object. i.e. printer is going to be shared between two threads
        mref.start();
        try {
            mref.join();//Synchronization of two threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        yref.start();



        /*
        PS D:\CompSci - Learn\Java>  d:; cd 'd:\CompSci - Learn\Java'; & 'C:\Users\jonat\AppData\Local\Programs\AdoptOpenJDK\jdk-11.0.10.9-hotspot\bin\java.exe' '-cp' 'C:\Users\jonat\AppData\Roaming\Code\User\workspaceStorage\3774530bc3882c8e199140bc1e2bc691\redhat.java\jdt_ws\Java_439a2f0f\bin' 'MultiThreading'
Application Started
Application Ended
>> Printing Document #1 - Johnsprofile.pdf
>> Printing Document #2 - Johnsprofile.pdf
>> Printing Document #3 - Johnsprofile.pdf
>> Printing Document #4 - Johnsprofile.pdf
>> Printing Document #5 - Johnsprofile.pdf
>> Printing Document #6 - Johnsprofile.pdf
>> Printing Document #7 - Johnsprofile.pdf
>> Printing Document #8 - Johnsprofile.pdf
>> Printing Document #9 - Johnsprofile.pdf
>> Printing Document #10 - Johnsprofile.pdf
PS D:\CompSci - Learn\Java> 

Printing is done in seperation from main thread.
        */

        System.out.println("Application Ended");
    }
}

class mythread extends Thread
{
    printer pref;
    mythread(printer p)
    {
        pref = p;
    }

    @Override
    public void run()
    {
        synchronized(pref)//Method 2 of synchronization - putting within synchronization block
        {
            pref.printDocument(10, "Bhaskarsprofile.pdf");
        }
    }
}

class mythread2 extends Thread
{
    printer pref;
    mythread2(printer p)
    {
        pref = p;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pref.printDocument(10, "Johnsprofile.pdf");
    }
}

class printer {
    //synchronized void printDocument(int num, String docName)//if one thread has access to synchronized method, no other thread can access it (method 1 of synchronization)
    void printDocument(int num, String docName)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.println(">> Printing Document #"+i+" - "+docName);
        }
    }
}