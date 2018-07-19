import java.util.*;
class P1  
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] s=new String[n];
        int[] sa=new int[n];
        int b=0;
        String fin="",temp1="",temp2="";
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
            sa[i]=s[i].length();
        }
        Arrays.sort(sa);
        int size=sa[0];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp1=temp1+s[j].substring(i,i+1);
                temp2=temp2+temp1.charAt(0);
            }
            if(temp1.equals(temp2))
            {
                fin=fin+temp2.charAt(0);
                temp1="";
                temp2="";
            }
            else
            break;
        }
        System.out.print(fin);
    }
}
