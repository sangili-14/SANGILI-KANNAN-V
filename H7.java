import java.util.*;
class H7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        String temp="";
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0 && a[i]%2!=0)
            {
                temp=temp+(a[i]+" ");
            }
            else if(i%2!=0 && a[i]%2==0)
            {
                temp=temp+(a[i]+" ");
            }
        }
        System.out.print(temp);
    }
}
