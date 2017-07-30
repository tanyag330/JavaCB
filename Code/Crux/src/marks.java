import java.util.Scanner;
class marks
{
public void accept(char name,int marks1,int marks2,int marks3)
{
int avmarks=(marks2+marks3)/2;
System.out.println("name is"+name);
System.out.println("average marks is"+ avmarks);
}}
class main
{
public static void main(String args[])
{
marks m1=new marks();
m1.accept(abc,10,20,30);
}}