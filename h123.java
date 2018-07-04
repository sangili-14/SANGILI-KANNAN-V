import java.util.*;
class h123
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int flag=0;
        String temp="";
        for(int i=0;i<a.length()-3;i++)
        {
            temp=a.substring(i,i+3);
            if(temp.equals(b))
            {
            flag=1;
            System.out.print("yes");
            break;
            }
        }
        if(flag==0)
        {
            System.out.print("no");
        }
    }    
}
