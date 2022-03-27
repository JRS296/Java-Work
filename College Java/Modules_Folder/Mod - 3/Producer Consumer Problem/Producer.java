public class Producer implements Runnable
{
    String items[] = {"a","b","c","d"};
    private Plate plate;
    public Producer(Plate plate)
    {
        this.plate = plate;
    }
    
    public void run()
    {
        for (int i=0; i<items.length; i++)
        {
            plate.put(items[i]);
            try{
            Thread.sleep(3000);
            }catch(Exception e)
            {e.printStackTrace();}
        }
        plate.put("Over");
    }
}