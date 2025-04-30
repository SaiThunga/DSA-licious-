Class Memory_AlLocation {

public static void main(String[] args) {
    int a=10;
    int b=20;
    int c= a+b;

    //Here all the variables a,b,& c  are stored in stack
    //value inside a,b,& c are stored in heap


//    🗂️ 1. Stack Memory
//     Stores method calls, local variables, and reference variables.
//     Memory is allocated per thread.
//     Follows LIFO (Last-In-First-Out) structure.
//     Automatically deallocated when a method ends.
//     Fast access and used for short-lived data.

//    🧺 2. Heap Memory
//        Used to store objects, instance variables, and arrays.
//        shared across all threads.
//        Memory must be managed by the garbage collector.
//        Slower than stack memory but holds data for longer lifetimes.


}
        }