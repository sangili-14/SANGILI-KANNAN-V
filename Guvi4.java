import java.util.*;
class Guvi4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="aeiouAEIOUbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        String a=sc.next();
        if(s.contains(a))
        {
            System.out.println("yes");
        }
        else
        System.out.println("No");
    }
}
