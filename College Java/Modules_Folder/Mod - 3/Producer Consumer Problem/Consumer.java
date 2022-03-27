public class Consumer implements Runnable
{
    private Plate plate;

    public Consumer(Plate plate)
    {
        this.plate = plate;
    }
    public void run()
    {
        for (String item = plate.take(); !item.equals("Over"); item = plate.take())
        {
            System.out.println("Item is :"+item);

            try
            {
                Thread.sleep(3000);
            }catch(Exception e)
            {e.printStackTrace();}
        }
    }
}