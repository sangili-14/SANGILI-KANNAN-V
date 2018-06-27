import java.util.*;
class Guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        String s1="aeiouAEIOU";
        String a=sc.next();
        if(s1.contains(a))
        {
            System.out.println("vowel");
        }
        else if(s.contains(a))
        {
            System.out.println("consonant");
        }
        else
        System.out.println("invalid");
    }
}
