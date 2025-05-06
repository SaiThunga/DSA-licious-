package Basics;

public class VarArgs {

    public static void main(String[] args) {
        printNumbers(1);
        System.out.println();
        printNumbers(1,2,3);
        System.out.println();
        printNumbers(1,2,3,4);
    }

    static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}


//How It Works Internally ?

//int... numbers is actually an array of type int[].
//So inside the method, you can treat numbers like an array.


//Only one varargs parameter is allowed in a method.
//Varargs must be the last parameter in the method.
