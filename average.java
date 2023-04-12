import java. util.Scanner;
public class average{
    public static void main(String args[]){
Scanner sc = new Scanner( System.in);
System.out.println(" Enter three number ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int average = ( a+b+c)/3 ;
System.out.println(" Average of three number is :" + average);
    } 
}