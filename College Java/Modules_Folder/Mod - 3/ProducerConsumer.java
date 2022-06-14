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

class Customer implements Runnable {
    private Plate plate;

    public Customer(Plate plate) {
        this.plate = plate;
    }

    public void run() {
        for (String item = plate.take(); !item.equals("Over"); item = plate.take()) {
            System.out.println("Item Received:" + item);

            try {
                System.out.println("Notification: Food is Eaten!!!");
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Server implements Runnable {
    String items[] = { "Juice", "Soup", "Chicken Tikka", "Kabab", "Paneer Tikka", "Fish 65", "Biriyani", "Lime Juice",
            "Butter Milk", "Fruit Salad", "Paan", };
    private Plate plate;

    public Server(Plate plate) {
        this.plate = plate;
    }

    public void run() {
        for (int i = 0; i < items.length; i++) {
            plate.put(items[i]);
            try {
                System.out.println("\nNotification: Food is Ready!!!\n");
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        plate.put("Over");
    }
}

class Plate {
    boolean empty = true;
    String item;

    public synchronized void put(String item) {
        while (!empty) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.item = item;
        notifyAll();
    }

    public synchronized String take() {
        while (empty) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        empty = true;
        return item;
    }
}