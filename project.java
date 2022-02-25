/*
THIS IS A PROGRAM TO TAKE INPUT FROM USER AND DISPLAY IT

 */
import java.util.Scanner;
public class project {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A number");
        int a=sc.nextInt();
        /*
        sc.nextInt(); // to receive integer value . ex like 2 4 9
        sc.nextLine();// to receive  string value
        sc.nextFloat();// to receive float value
        sc.nextDouble();// to receive double value

         */
        System.out.println(" result is:"+a);
    }
}