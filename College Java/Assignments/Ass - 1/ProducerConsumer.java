public class ProducerConsumer {
    public static void main(String args[]) {
        Plate p = new Plate();
        Server producer = new Server(p);
        Customer consumer = new Customer(p);
        
        Thread pt = new Thread(producer);
        Thread ct = new Thread(consumer);

        pt.start();
        ct.start();
    }
}