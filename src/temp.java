import java.util.Scanner;
public class temp {
    public static void main(String[]args){
        Scanner temp=new Scanner(System.in);
        System.out.println("enter your temp in fahrenheit");
        double F=temp.nextDouble();
        double c;
        c=(F-32)/1.8;
        System.out.println("temprature in celcius="+c);
    }

}
