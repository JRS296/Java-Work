public class ProducerConsumer
{
    public static void main(String args[])
    {
        Plate plate = new Plate();
        Producer producer = new Producer(plate);
        Consumer consumer = new Consumer(plate);

        Thread pt = new Thread(producer);
        Thread ct = new Thread(consumer);

        pt.start();
        ct.start();
    }
}