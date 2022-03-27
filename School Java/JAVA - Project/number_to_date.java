import java.util.*;
class number_to_date{
    public static void main(){
        Scanner input = new Scanner(System.in);
        double n = 0; int b = 0;
        for(int i = 0; i < 1; ){
            System.out.println("Enter n >= 10000");
            n = input.nextInt();
            if(n < 10000){
                System.out.println("Invalid input, please retry");
                continue;
            }
            else{
                break;
            }
        }
        double a = n % 10000;
        n = (n - a) / 10000;
        int x = 365;
        do{
            if(a % 100 == 0){
                if(a % 400 == 0){
                    b = 1;
                    x = 366;
                }
                else{
                    b = 0;
                }
            }
            else{
                if(a % 4 == 0){
                    b = 1;
                    x = 366;
                }
                else{
                    b = 0;
                }
            }
            if(n > x){
                n = n - x;
                a = a + 1;
            }
        }while(n > x);
        String month[] = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        int dayno[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(a == 1){
            dayno[1] = 29;
        }
        for(int i = 0; i <= 11; i++){
            if(n > dayno[i]){
                n = n - dayno[i];
                continue;
            }
            else{
                System.out.println(" The date is : " + n + " " + month[i] +
                    " " + a);
                break;
            }
        }
    }
}
/*
 Enter n >= 10000
172002
 The date is : 17.0 January 2002.0
 */