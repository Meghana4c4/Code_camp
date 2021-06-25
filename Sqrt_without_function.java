import java.util.*;
public class Sqrt_without_function
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter num: ");
int n=s.nextInt();
float sqrt,t=0;
sqrt=n/2;
if(n==1)
{
System.out.println("Square root of "+n+" is "+n);
}
else
{
while(sqrt!=t)
{
t=sqrt;
sqrt=(n/t+t)/2;
}
System.out.println("Square root of "+n+" is "+sqrt);
}
}
}