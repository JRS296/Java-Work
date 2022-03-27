public class Customer implements Runnable {
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