package Oops.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            Student s=new Student();
//            s.setAge(24);
//            s.setName("Saikrishna");
//
//            System.out.println(s.getAge());
//            System.out.println(s.getName());


            BankAccount b=new BankAccount(1000);

            System.out.println("Hey, Welcome to the SBI bank");
            System.out.println("Please select operation you want select");
            System.out.println("1-Check balance/\n2-deposit\n3-withdraw");

            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
            if(option==1){
                System.out.println(b.getBalance());
            }
            else if(option==2){
                System.out.println("please enter the amount you want to deposit");
                double amount=sc.nextDouble();
                b.deposit(amount);
                System.out.println("Total Balance : "+b.getBalance());
            }
            else if(option==3){
                System.out.println("please enter the amount you want to withdraw");
                double amount=sc.nextDouble();
                b.withdraw(amount);
                System.out.println("Total Balance : "+b.getBalance());
            }

    }
}
