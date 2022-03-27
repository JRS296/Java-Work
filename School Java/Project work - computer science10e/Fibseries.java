class Fibseries
{
    int first;
    int second;
    int i , count = 30 , third;
    Fibseries()
    {
        first = 0;
        second = 1;
    }
    void PrintSeries()
    {
        System.out.print(first + " " + second);
        for (i = 2 ; i < count ; i ++)
        {
             third = first + second;
             System.out.print(" " + third);
             first = second;
             second = third;
            }
        }
    public static void amin()
    {
        Fibseries obj = new Fibseries();
        obj.PrintSeries();
    }
}
        