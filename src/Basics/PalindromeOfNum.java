package Basics;

import java.util.Scanner;

public class PalindromeOfNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num= scanner.nextInt();
        if(reverse(num)==num){
            System.out.println(" Its a Palindrome  ");
        }
        else
            System.out.println(" Not a Palindrome ");
    }

    public static int reverse(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum*10 +rem;
            num=num/10;
        }
        return sum;
    }
}
