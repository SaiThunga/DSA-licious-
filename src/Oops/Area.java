package Oops;

public class Area {
    public static void main(String[] args) {
        int l=2,b=3;double r=3.5;
        System.out.println("Area of Square : "+area(l));
        System.out.println("Area of rectangle : "+area(l,b));
        System.out.println("Area of circle : "+area(r));
    }
    static int area(int l){
        int areaOfSquare=l*l;
        return areaOfSquare;
    }
    static int area(int l,int b){
        int areaOfRectangle=l*b;
        return areaOfRectangle;
    }
    static double area(double r){
        double areaOfCircle=2*3.14*r*r;
        return areaOfCircle;
    }

}
