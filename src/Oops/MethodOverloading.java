package Oops;

public class MethodOverloading {

    public static void main(String[] args) {
        int a = 1,b=2,c=3,d=4;

        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));

    }

     public static int sum(int a,int b) {
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        return a+b+c+b;
    }
}


/*
Method Overloading:
You can define multiple methods with the same name in the
 same class but with different parameter lists.


To overload a method, you must change one or more of:
Number of parameters
Type of parameters
Order of parameters (if types differ)*/