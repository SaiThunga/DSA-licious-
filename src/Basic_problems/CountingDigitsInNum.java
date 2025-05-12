package Basic_problems;

import java.util.Scanner;

public class CountingDigitsInNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num= scanner.nextInt();

        int count=count(num);
        System.out.println("Number of digits in the NUmber : "+ count);
    }

    public static int count(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count=count+1;
        }
        return count;
    }

}
