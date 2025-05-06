package Basics;

import java.util.Scanner;

public class SumOFNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number up to which you want the sum :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Total sum : "+ sum);
    }
}
