import java.util.*;
class Guvi101
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String f=s.substring(s.length()-n);
        System.out.println(f);
    }
}
