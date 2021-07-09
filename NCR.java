import java.util.*;
public class NCR
{
static int fact(int n)
{ 
 int fact=1;
for(int i=n;i>=1;i--)
{
fact=fact*i;
}
return fact;
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Input1: ");
int n=s.nextInt();
System.out.println("Input2: ");
int r=s.nextInt();
System.out.println("Input3: ");
double m=s.nextDouble();
int ncr=(int)(fact(n)/(fact(r)*fact(n-r))%m);
System.out.println(ncr);
}
}
