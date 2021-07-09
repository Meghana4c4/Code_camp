import java.util.*;
public class MBA_Challenge
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Input1: ");
int N=s.nextInt();
System.out.println("Input2: ");
int K=s.nextInt();
int S=(int)Math.pow(N,K);
int rem=S%10;
System.out.println(S);
}
}