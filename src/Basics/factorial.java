package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the Number ");
        int num=sc.nextInt();
        BigInteger fact=factorial(num);
        System.out.println("Factorial of "+num +" is "+fact);
    }
    public static BigInteger factorial(int num){
        if (num==0 || num==1){
            return BigInteger.ONE;
        }
        else
            return BigInteger.valueOf(num).multiply(factorial(num - 1));
    }
}
