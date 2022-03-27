import java.util.*;
public class program_5
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input for products ");
        System.out.println("1 for lcd tv which costs25,000$");
        System.out.println("2 for lcd projecter which costs 15,000$");
        System.out.println("3 for lcd moniter which costs 65,000$");
        System.out.println("4 for wall ac which costs 40,000$");
        System.out.println("5 for window ac which costs 22,500$");
        System.out.println("6 for ceiling or duct ac which costs 75,000$");
        System.out.println("input number for product ");
        System.out.print("input number for 1st product ");int a=in.nextInt();System.out.println();
        System.out.print("input number for 2nd product (if wanted esle input 0)");int b=in.nextInt();System.out.println();
        System.out.print("input number for 3rd product (if wanted esle input 0)");int c=in.nextInt();System.out.println();
        System.out.print("input number for 4th product (if wanted esle input 0)");int d=in.nextInt();System.out.println();
        System.out.print("input number for 5th product (if wanted esle input 0)");int e=in.nextInt();System.out.println();
        System.out.print("input number for 6th product (if wanted esle input 0)");int f=in.nextInt();System.out.println();
        int i,j,k,l,m,n,o,p,price_1,price_2,price_3,price_4,price_5,price_6,tax,tax1,tax2,tax3,tax4,tax5,tax6,case_1=0,case_2=0,case_3=0,case_4=0,case_5=0,case_6=0;//8 discounts + 6 prices of different objects + tax        
        int q,r,s,t,u,v;// all prices of each case and object are stored in these variablesprice_1=25000;
        price_1=25000;
        price_2 =15000;               
        price_3=65000;
        price_4=40000;
        price_5=22500;
        price_6 =75000;                                      
        i=5/100;
        j=8/100;
        k=10/100;
        l=12/100;
        m=10/100;
        n=13/100;
        o=15/100;
        p=20/100;
        tax=125/1000;
        q=(price_1 * j) ;
        r=(price_2 * 0) ;
        s=(price_3 * l) ;
        t=(price_4 * o) ;
        u=(price_5 * m) ;
        v=(price_6 * p) ;
        switch (a)
        {
            case 1:
            System.out.print ("discount = 8%");case_1=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_1=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_1=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_1=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_1=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_1=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_1);
        int taxprice1=tax*case_1;
        int taxi1=taxprice1+case_1;
        System.out.println("final price is (with tax)"+taxi1);
        switch (b)
        {
            case 1:
            System.out.print ("discount = 8%");case_2=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_2=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_2=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_2=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_2=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_2=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_2);
        int taxprice2=tax*case_2;
        int taxi2=taxprice1+case_2;
        System.out.println("final price is (with tax)"+taxi2);
        switch (c)
        {
            case 1:
            System.out.print ("discount = 8%");case_3=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_3=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_3=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_3=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_3=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_3=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_3);
        int taxprice3=tax*case_3;
        int taxi3=taxprice1+case_3;
        System.out.println("final price is (with tax)"+taxi3);
        switch (d)
        {
            case 1:
            System.out.print ("discount = 8%");case_4=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_4=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_4=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_4=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_4=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_4=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_4);
        int taxprice4=tax*case_4;
        int taxi4=taxprice1+case_4;
        System.out.println("final price is (with tax)"+taxi4);
        switch (e)
        {
            case 1:
            System.out.print ("discount = 8%");case_5=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_5=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_5=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_5=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_5=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_5=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_5);
        int taxprice5=tax*case_5;
        int taxi5=taxprice1+case_5;
        System.out.println("final price is (with tax)"+taxi5);
        switch (f)
        {
            case 1:
            System.out.print ("discount = 8%");case_6=price_1-q;
            break;
            case 2:
            System.out.print ("discount = 0 ");case_6=price_2-r;
            break;
            case 3:
            System.out.print ("discount = 12%");case_6=price_3-s;
            break;
            case 4:
            System.out.print ("discount = 15%");case_6=price_4-t;
            break;
            case 5:
            System.out.print ("discount = 10%");case_6=price_5-u;
            break;
            case 6:
            System.out.print ("discount = 20%");case_6=price_6-v;
            break;
            default:
            System.out.println ("invalid input");
        }
        System.out.println ("PRICE = " +case_6);
        int taxprice6=tax*case_6;
        int taxi6=taxprice1+case_6;
        System.out.println("final price is (with tax)"+taxi6);
        int h=case_1+case_2+case_3+case_4+case_5+case_6;// total amount spent
        int hi=taxi1+taxi2+taxi3+taxi4+taxi5+taxi6;
        System.out.println("total price is (without tax)"+h);
        System.out.println("total price is (with tax)"+hi);
    }
}
