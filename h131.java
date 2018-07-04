import java.util.*;
class h131
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int x=0,y=a.length-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                b[i]=a[y--];
            }
            else
            b[i]=a[x++];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}


