package Basic_problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=scanner.nextInt();

        if(checkPrime(num)){
            System.out.println("It's a Prime Number");
        }
        else
            System.out.println("Not a Prime Number");

    }

    public static boolean checkPrime(int num){

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
    }
}

