import java.util.*;
class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int b=0;
        int c=2;
        String temp="";
        for(int i=0;i<s.length()/2;i++)
        {
            temp=s.substring(b,c);
            b=b+2;
            c=c+2;
            StringBuffer obj=new StringBuffer(temp);
            obj.reverse();
            System.out.print(obj);
        }
        if((s.length()/2)!=(s.length()-s.length()/2))
        System.out.print(a[a.length-1]);
    }
}





