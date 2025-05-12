package Problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
