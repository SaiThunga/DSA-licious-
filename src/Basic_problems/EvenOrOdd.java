package Basic_problems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to find it is Even or Odd");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even Number");
        }
        else
            System.out.println(num + " is Odd Number");
    }
}
