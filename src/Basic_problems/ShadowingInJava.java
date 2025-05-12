package Basic_problems;

public class ShadowingInJava {
    static int a=10;
    public static void main(String[] args) {
        System.out.println(a);
        int a=20;

        System.out.println(a);
    }
}


//Shadowing happens when a local variable or parameter has the same name as a variable in an outer scope,
// such as an instance variable (field) or class variable.

//When this happens, the inner variable "shadows" the outer one,
// making the outer one temporarily inaccessible in that scope.