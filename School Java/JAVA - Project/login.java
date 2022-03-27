import java.io.*;
import java.lang.*;
class login
{
    public static void main(String args[])throws IOException
    {
        String inh,inm,onh,onm,dnh,dnm,odh,odm,m2,m3,m4,m5;
        int n=0,i=0,j=0,m6,m1,m7,m8,cinh,d1=0,cinm,conh,conm,cidh,cidm,codh,codm;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Maximum login time 48 hours,maximum users 100:");
        System.out.println("Enter no of users:");
        n=Integer.parseInt(input.readLine());
        int user[]=new int[n];
        String li[]=new String[n];
        String lid[]=new String[n];
        String lo[]=new String[n];
        String lod[]=new String[n];
        int diff[]=new int[n];
        int h[]=new int[n];
        int m[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter user identification number:");
            user[i]=Integer.parseInt(input.readLine());
            System.out.println("Enter login time:(hh:mm)");
            li[i]=input.readLine();
            System.out.println("Enter login date:(dd-mm)");
            lid[i]=input.readLine();System.out.println("Enter logout time:(hh:mm)");
            lo[i]=input.readLine();
            System.out.println("Enter logoutdate:(dd-mm)");
            lod[i]=input.readLine();
        }
        for(i=0;i<n;i++)
        {
            inh=li[i].substring(0,2);
            inm=li[i].substring(3);
            cinh=Integer.parseInt(inh);
            cinm=Integer.parseInt(inm);
            onh=lo[i].substring(0,2);
            onm=lo[i].substring(3);
            conh=Integer.parseInt(onh);
            conm=Integer.parseInt(onm);
            dnh=lid[i].substring(0,2);
            dnm=lid[i].substring(3);
            cidh=Integer.parseInt(dnh);
            cidm=Integer.parseInt(dnm);
            odh=lod[i].substring(0,2);
            odm=lod[i].substring(3);
            codh=Integer.parseInt(odh);
            codm=Integer.parseInt(odm);
            if((lid[i]).equals(lod[i]))
            {
                diff[i]=(((conh*60)+conm)-((cinh*60)+cinm));
                h[i]=diff[i]/60;
                m[i]=diff[i]%60;
            }
            else
            {
                d1=codh-cidh;
                if(d1==1)
                {
                    diff[i]=(((1440-((cinh*60)+cinm)))+((conh*60)+conm));
                }
                else if(d1>1)
                {
                    diff[i]=(1440)+(((1440-((cinh*60)+cinm)))+((conh*60)+conm));
                }
            }
            h[i]=diff[i]/60;m[i]=diff[i]%60;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(" User Login LogoutDuration ");
            System.out.println("Identification Time & Date Time & DateHours:Mins");
            System.out.println(" "+user[i]+" "+li[i]+" "+lid[i]+""+lo[i]+" "+lod[i]+" "+h[i]+" "+m[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(diff[i]>diff[j])
                { 
                    m6=diff[i];
                    diff[i]=diff[j];
                    diff[j]=m6;
                    m1=user[i];
                    user[i]=user[j];
                    user[j]=m1;
                    m2=li[i];
                    li[i]=li[j];
                    li[j]=m2;
                    m3=lid[i];
                    lid[i]=lid[j];
                    lid[j]=m3;
                    m4=lo[i];
                    lo[i]=lo[j];
                    lo[j]=m4;
                    m5=lod[i];
                    lod[i]=lod[j];
                    lod[j]=m5;
                    m7=h[i];
                    h[i]=h[j];
                    h[j]=m7;
                    m8=m[i];
                    m[i]=m[j];
                    m[j]=m8;
                }
            }
        }
        System.out.println("The user who logged in for longest duration:");
        System.out.println(" "+user[n-1]+" "+li[n-1]+" "+lid[n-1]+""+lo[n-1]+" "+lod[n-1]+" "+h[n-1]+" "+m[n-1]);
    }
}
/*
 Enter user identification number:
4564
Enter login time:(hh:mm)
20:46
Enter login date:(dd-mm)
12-03
Enter logout time:(hh:mm)
23:34
Enter logoutdate:(dd-mm)
13-03
Enter user identification number:
5666
Enter login time:(hh:mm)
10:50
Enter login date:(dd-mm)
15-03
Enter logout time:(hh:mm)
11:00
Enter logoutdate:(dd-mm)
15-03
 User Login LogoutDuration 
Identification Time & Date Time & DateHours:Mins
 4564 20:46 12-0323:34 13-03 26 48
 User Login LogoutDuration 
Identification Time & Date Time & DateHours:Mins
 5666 10:50 15-0311:00 15-03 0 10
The user who logged in for longest duration:
 4564 20:46 12-0323:34 13-03 26 48
 */

