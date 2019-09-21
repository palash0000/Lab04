package ques1;
import java.util.Scanner;
public class Harmonic{
    public static void main(String[] args){
        System.out.println("enter the number ");
        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt();
        double sum =0;
        for(int i=1;i<=n;i++){
            sum = sum+(1.0/i);

        }
        System.out.println("the sum of series"+sum);
    }

}

