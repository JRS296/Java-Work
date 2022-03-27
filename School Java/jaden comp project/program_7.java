import java.util.*;
public class program_7
{
    public static void main()
    {
        System.out.println("input ten numbers");
        long a,b,c,d,e,f,g,h,i,j;
        Scanner in = new Scanner (System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        f = in.nextInt();
        g = in.nextInt();
        h = in.nextInt();
        i = in.nextInt();
        j = in.nextInt();
        long k = Math.max(a,b);
        long l = Math.max(k,c);
        long m = Math.max(l,d);
        long n  = Math.max(m,e);
        long o = Math.max(n,f);
        long p = Math.max(o,g);
        long q = Math.max(p,h);
        long r = Math.max(q,i);
        long s = Math.max(r,j);
        System.out.println("the largest of the ten numbers inputed is "+s);
        long t = Math.min(a,b);
        long u = Math.min(t,c);
        long v = Math.min(u,d);
        long w = Math.min(v,e);
        long x = Math.min(w,f);
        long y = Math.min(x,g);
        long z = Math.min(y,h);
        long aa = Math.min(z,i);
        long bb = Math.min(aa,j);
        System.out.println("the smallest of the ten numbers inputed is "+bb);
    }
}
