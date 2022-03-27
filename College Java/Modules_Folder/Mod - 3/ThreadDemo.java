public class ThreadDemo {
    public static void main(String[] args) {
        
        //Anything in Main Method is executed by main thread

        System.out.println("Application Test 1");//Job 1

        //task mytask1 = new task(); //Job 2
        //mytask1.start(); //start() automatically calls run()
        	
        Runnable r = new task();
        Thread t = new Thread(r);
        t.start(); //
        

        //Job 3 and 4 will not execute until Job 2 is done - Sequential Control flow
        for(int doc = 1; doc <= 10; doc++)
        {
            System.out.println(" $ Printing Document #"+doc+" - Printer 1");//Job 3
        }


        System.out.println("Application Test 1 Finished");//Job 4   
        //Job 1,2,3 are done in sequence   
    }   
}

/*
//Original Class to demonstrate Sequential Flow of Control

class task 
{
    void executeTask()
    {
        for(int doc = 1; doc <= 10; doc++)
        {
            System.out.println(" %% Printing Document #"+doc+" - Printer 2");//Job 2
        }
    }
}
*/

//class task extends CA, Thread {} {-> Error: Multiple Inheritence not supported in Java}
class task extends CA implements Runnable //Class Task is now a thread as it extends Thread Class
{
    @Override
    public void run() //Overriding Run Method
    {
        for(int doc = 1; doc <= 10; doc++)
        {
            System.out.println(" % Printing Document #"+doc+" - Printer 2");//Job 2
        }
    }
}

/*
PS D:\CompSci - Learn\Java>  d:; cd 'd:\CompSci - Learn\Java'; & 'C:\Users\jonat\AppData\Local\Programs\AdoptOpenJDK\jdk-11.0.10.9-hotspot\bin\java.exe' '-cp' 'C:\Users\jonat\AppData\Roaming\Code\User\workspaceStorage\3774530bc3882c8e199140bc1e2bc691\redhat.java\jdt_ws\Java_439a2f0f\bin' 'ThreadDemo' 
Application Test 1
 $ Printing Document #1 - Printer 1
 % Printing Document #1 - Printer 2
 % Printing Document #2 - Printer 2
 $ Printing Document #2 - Printer 1
 % Printing Document #3 - Printer 2
 $ Printing Document #3 - Printer 1
 $ Printing Document #4 - Printer 1
 % Printing Document #4 - Printer 2
 $ Printing Document #5 - Printer 1
 % Printing Document #5 - Printer 2
 $ Printing Document #6 - Printer 1
 % Printing Document #6 - Printer 2
 % Printing Document #7 - Printer 2
 % Printing Document #8 - Printer 2
 % Printing Document #9 - Printer 2
 $ Printing Document #7 - Printer 1
 % Printing Document #10 - Printer 2
 $ Printing Document #8 - Printer 1
 $ Printing Document #9 - Printer 1
 $ Printing Document #10 - Printer 1
Application Test 1 Finished
PS D:\CompSci - Learn\Java> 

//Output Occurs conccurently, i.e. parallel to main thread along with the child thread
//Both threads do not interfere with the others so parralel is possible
*/

class CA 
{

}

/* 
PS D:\CompSci - Learn\Java>  d:; cd 'd:\CompSci - Learn\Java'; & 'C:\Users\jonat\AppData\Local\Programs\AdoptOpenJDK\jdk-11.0.10.9-hotspot\bin\java.exe' '-cp' 'C:\Users\jonat\AppData\Roaming\Code\User\workspaceStorage\3774530bc3882c8e199140bc1e2bc691\redhat.java\jdt_ws\Java_439a2f0f\bin' 'ThreadDemo' 
Application Test 1
 $ Printing Document #1 - Printer 1
 % Printing Document #1 - Printer 2
 % Printing Document #2 - Printer 2
 $ Printing Document #2 - Printer 1
 $ Printing Document #3 - Printer 1
 % Printing Document #3 - Printer 2
 % Printing Document #4 - Printer 2
 $ Printing Document #4 - Printer 1
 % Printing Document #5 - Printer 2
 $ Printing Document #5 - Printer 1
 % Printing Document #6 - Printer 2
 $ Printing Document #6 - Printer 1
 % Printing Document #7 - Printer 2
 $ Printing Document #7 - Printer 1
 $ Printing Document #8 - Printer 1
 % Printing Document #8 - Printer 2
 $ Printing Document #9 - Printer 1
 % Printing Document #9 - Printer 2
 % Printing Document #10 - Printer 2
 $ Printing Document #10 - Printer 1
Application Test 1 Finished
PS D:\CompSci - Learn\Java> 
*/