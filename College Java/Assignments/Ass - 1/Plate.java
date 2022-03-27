public class Plate {
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