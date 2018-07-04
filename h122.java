import java.util.*;
class h122
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,cow=0,flag=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            cow=cow+a[i];
            for(int j=i+2;j<n;j++)
            {
                temp=temp+a[j];
            }
            if(cow==temp)
            {
            flag=1;
            break;
            }
            else
            {
                temp=0;
            }
        }
        if(flag==1)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
