import java.util.Scanner;
public class calculator
{
char o;
int a,b;
public void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
a=sc.nextInt();
System.out.println("enter b");
b=sc.nextInt();
System.out.println("enter o");
o=sc.next().charAt(0);
}
void pro()
{
switch(o)
{
case '+':
System.out.println("addition is"+(a+b));
break;
case '-':
System.out.println("sub is"+(a-b));
break;
case '*':
System.out.println("mul is"+(a*b));
break;
case '/':
System.out.println("div is" + (a/b));
            break;
case '%':
            System.out.println("rem is " + (a%b));
            break;

        default:
            System.out.println("invalid operator");
}}}
class main
{
public static void main(String args[])
{
calculator c1=new calculator();
c1.accept();
c1.pro();
}}












