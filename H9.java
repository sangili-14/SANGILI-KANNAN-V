import java.util.*;
class H9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,c1=1;
        String temp="";
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                c=a[i]+a[j];
                c1=c;
                if(c1==0)
                temp=temp+(a[i]+" "+a[j]+" ");
            }
            c1=1;
        }
        System.out.print(temp);
    }
}


