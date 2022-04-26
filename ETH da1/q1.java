import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.*;
import java.lang.Runnable;

class q1 {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new MyClass("thread1:"));
        Thread thread2 = new Thread(new MyClass("thread2:"));
        thread1.start();
        thread2.start();
        boolean thread1IsAlive = true;
        boolean thread2IsAlive = true;
        do {
            if (thread1IsAlive && !thread1.isAlive()) {
                thread1IsAlive = false;
                System.out.println("Thread 1 is dead.");
            }
            if (thread2IsAlive && !thread2.isAlive()) {
                thread2IsAlive = false;
                System.out.println("Thread 2 is dead.");
            }
        } while (thread1IsAlive || thread2IsAlive);
    }
}

class MyClass implements Runnable {
    static String message[] = { "Java", "is", "hot", "aromatic", "and", "invigorating." };
    String name;

    public MyClass(String id) {
        name = id;
    }

    public void run() {
        for (int i = 0; i < message.length; ++i) {
            randomWait();
            System.out.println(name + message[i]);
        }
    }

    void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (3000 * Math.random()));
        } catch (InterruptedException x) {
            System.out.println("Interrupted !");
        }
    }
}