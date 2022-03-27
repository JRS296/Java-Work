public class Server implements Runnable {
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