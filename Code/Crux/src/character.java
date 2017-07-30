import java.util.Scanner;
public class character
{
char c;
public void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter c");
c= sc.next().charAt(0);
if(c>=65&&c<=90)
{
System.out.println("entered character is in uppercase");
}
else if(c>=97&&c<=122)
{
System.out.println("entered character is in lowercase");
}
else
{
System.out.println("invalid character");
}}}
class main
{
public static void main(String args[])
{
character c1=new character();
c1.accept();
}}
