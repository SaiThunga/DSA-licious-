package Problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the range Where you want all the Armstrong number in between : ");
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        for(int i=a;i<=b;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }
    static  boolean isArmstrong(int num){
        int temp=num,sum=0;

        while(num!=0){
            int rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }


}
