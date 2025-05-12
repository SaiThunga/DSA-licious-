package Basic_problems;

public class PrimitiveVsObjects {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = "hello";

        changeArr(arr);
        changeString(str);

        System.out.println(arr[0]); // 99

//        Arrays are objects in Java.
//        When you pass an array to a method, you're passing a reference to the original array.
//        So, if you change arr[0] inside the method, you're changing the actual array.

        System.out.println(str);    // hello

//        When you "change" a string inside a method, you're just creating a new string object—not
//        changing the original.
//        Also, Java passes object references by value, meaning the method gets a copy of the reference,
//        but can't change what the caller's variable points to
    }

    static void changeArr(int[] arr) {
        arr[0] = 99;
    }

    static void changeString(String s) {
        s = "new value"; // Just changes local reference
    }
}
