
class pattern_4
{
  public static void main(String args[])
  {
      int sp = 29;
      for(int i = 4; i >= 0 ; i--)
      {
          for(int j = 1; j <= sp ; j++)
          {
              System.out.print(" ");
            }
          for(int j = 1; j <= i ; j++)
          {
              System.out.print("@ ");
            }
          System.out.println();
          sp++;
        }
    }
}
