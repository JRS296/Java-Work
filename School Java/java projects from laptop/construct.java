import java.util.Scanner;
class construct
{
  int x; int y; int z; 
  int chicken(int a,int b)
  {
      a = x; b = y;
      x = y + z;
      return x;
    }
  void main (String args[])
  {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();int b = sc.nextInt();
      construct obj = new construct();
      obj.chicken(a,b);
      System.out.println(x);
    }
}
  
