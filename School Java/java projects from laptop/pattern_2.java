class pattern_2
{
  public static void main(String args[])
  {
      int sp = 29;
      for(int i = 0; i <= 5 ; i++)
      {
          for(int j = 1; j <= sp ; j++)
          {
              System.out.print(" ");
            }
          for(int j = i; j >= 0 ; j--)
          {
              System.out.print(j);
            }
          for (int j = 1 ; j <= i ; j ++)
          {
              System.out.print(j);
            }
          System.out.println();
          sp--;
        }
    }
}