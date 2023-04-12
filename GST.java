import java.util.Scanner;
public class GST {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
float pen = sc.nextFloat();
float pencil = sc.nextFloat();
float eraser= sc.nextFloat();

float total = pen + pencil + eraser;
System.out.println(" total is "+ total);

// add on
float newtotal = total +(0.18f* total);
System.out.println(" bill with 18% gst" + newtotal);



}
    
}
