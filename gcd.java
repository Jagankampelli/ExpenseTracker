import java.util.*;

public class Gcd{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0)
      {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i=0;
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int sum=gcd(ar,x);
        System.out.println(sum);
      }
    }
    public static int gcd(int ar[],int x)
    {
      if(x==1)
      {
        return 0;
      }
      else
      {
        int  max=countmax(ar,x);
        return max+gcd(ar,max);
      }
    }
    public static int countmax(int ar[],int x)
    {
      int i=0;
      int max=gcd1(ar[0],x),j;
      for(i=1;i<ar.length;i++)
      {
        j=gcd1(ar[i],x);
        if(max<j)
        {
          max=j;
        }
      }
      return max;
    }
    public static int gcd1(int a,int b)
    {
      if(b==0)
      return a;
      else
      return gcd1(b,a%b);
      }
}