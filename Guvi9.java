import java.util.*;
class Guvi9
{
    public static void main(String args[])
    {
        int sum=0,i;
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] a=new int[n1];
        int n2=sc.nextInt();
        for(i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n2;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
