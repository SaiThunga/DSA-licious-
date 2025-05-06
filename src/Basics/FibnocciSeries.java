package Basics;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.Arrays;

public class FibnocciSeries {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=scanner.nextInt();
        int []fib=fib(num);
        System.out.println(Arrays.toString(fib));
    }

    public static int[] fib(int num){

        int[] numbers = new int[num];
        int a=0;
        int b=1;
        numbers[a]=0;
        numbers[b]=1;
        for (int i=2; i<numbers.length;i++){
            numbers[i]=numbers[a]+numbers[b];
            a=i-1;
            b=i;
        }
        return numbers;
    }
}
