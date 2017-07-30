import java.util.Scanner;
public class SimpleInterest {
 public void calculate(int principal,int rate,int time) {
        double interest = principal * time * rate / 100;
        double amount = principal + interest;
        System.out.println("Interest is " + interest);
        System.out.println("Amount is " + amount);
    }
}
class main
{
public static void main(String args[])
{
SimpleInterest s1=new SimpleInterest();
s1.calculate(2,3,100);
}}