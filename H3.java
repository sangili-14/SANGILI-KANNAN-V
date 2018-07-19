import java.util.*;
class H3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String temp="";
        int flag=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==i)
            {
                flag=1;
                temp=temp+(a[i]+" ");
            }
        }
        if(flag==0)
        System.out.print(-1);
        else
        System.out.print(temp);
    }
}
