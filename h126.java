import java.util.*;
class h126
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String[] a=s.split("\\s");
        for(int i=0;i<a.length;i++)
        {
            if(Character.isUpperCase(a[i].charAt(0)))
            {
                count+=1;
            }
        }
        if(count==a.length)
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}
