import java.util.Scanner;
public class basics
{
double basic,hra,t_sal,da,pf,allow;
char grade, A, B, C;
public void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter basic");
basic=sc.nextInt();
System.out.println("enter grade");
grade=sc.next().charAt(0);
hra=(0.2)*basic;
da=(0.5)*basic;
pf=(0.11)*basic;
if (grade=='A')
{allow=1700;
}
else if(grade=='B')
{allow=1500;
}
else if(grade=='C')
{allow=1300;
}
t_sal=basic+hra+da+allow-pf;
System.out.println("calculate total salary"+t_sal);
}}
class main
{
public static void main(String args[])
{
basics b1=new basics();
b1.accept();
}}