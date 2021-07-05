import java.util.*;
public class Zeros
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter row and column: ");
int n=s.nextInt();
int m=s.nextInt();
System.out.println("Enter "+n+" X "+m+" Elements: ");
int mat [ ] [ ]=new int [n] [m];
int row[] = new int[n];
int col[] = new int[m];
for (int i=0; i<n;i++)
{
for(int j=0;j<m;j++)
{
mat[i][j]=s.nextInt();
if(mat[i][j]==0)
{
row[i]=1;
col[j]=1;
}
}
}
for(int i=0;i<n;i++)
{
if(row[i]==1)
{
for(int j=0;j<m;j++)
{
mat[i][j]=0;
}
}
}
for(int j=0;j<m;j++)
{
if(col[j]==1)
{
for(int i=0;i<n;i++)
{
mat[i][j]=0;
}
}
}
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
}}
