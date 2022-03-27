
import java.io.*;
class numlessthan10000
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String ty[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        String ten[]={"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
                "Eighteen","Nineteen"};

        String unit[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Enter a Number : ");
        int n=Integer.parseInt(br.readLine());

        /*checking whether the number is in the range [1-9999] or not*/
        if(n<1 || n>9999)
            System.out.println("Out of Range");

        else
        {
            int th=n/1000; //finding the digit at thousand's place
            int h=(n/100)%10; //finding the digit at hundred's place
            int t=(n/10)%10; //finding the digit at ten's place
            int u=n%10; //finding the digit at unit's place

            System.out.print("Output = ");

            /*Condition for printing digit at thousand's place, is that it should not be zero*/
            if(th!=0)
                System.out.print(unit[th]+" Thousand");

            /*Condition for printing digit at hundred's place, is that it should not be zero*/
            if(h!=0)
                System.out.print(" "+unit[h]+" Hundred");

            /*Condition for printing the word "And"*/
            if((t!=0 || u!=0)&&(th!=0 || h!=0))
                System.out.print(" And");

            /*Condition for printing digit at ten's place*/
            if(t==1) //When digit at ten's place is 1, we have different words like Ten, Eleven etc.
                System.out.print(" "+ten[u+1]);

            else //if it is not 1 then we print the words following a normal pattern
                System.out.print(" "+ty[t]+" "+unit[u]);
        }
    }
}
/*
Enter a Number : 6678
Output = Six Thousand Six Hundred And Seventy Eight
 */