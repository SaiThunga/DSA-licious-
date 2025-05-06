package Basics;

import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the char to find out it is vowel or Consonants : ");
        char ch=scanner.next().charAt(0);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Char '" + ch + "' is a Vowel");
                break;
            default:
                if(ch>'a' || ch>'A' && ch<'z' || ch<'Z'){
                    System.out.println("Char '" + ch + "' is a Consonant");
                }else
                    System.out.println("Enter valid input");
        }
    }
}
