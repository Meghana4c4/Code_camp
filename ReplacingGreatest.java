import java.util.*;
public class ReplacingGreatest
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter size: ");
int n=s.nextInt( );
int e[ ]=new int[n];
System.out.println("Enter elements: ");
for(int i=0;i<n;i++)
{e[i]=s.nextInt( );}
for (int i=0;i<(n-1);i++)
{
int max=0;
for(int j=i+1;j<n;j++)
{
if(e[j]>max)
{max=e[j];}
}
e[i]=max;
}
e[n-1]=-1;
for(int i=0;i<n;i++)
{
System.out.print(e[i]+" ");
}
}
}
