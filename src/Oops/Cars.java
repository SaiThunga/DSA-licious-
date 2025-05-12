package Oops;

public class Cars {
    String brand;
    String model;
    double year;

    public static void main(String[] args) {
        Cars c=new Cars();
        c.display();
        Cars c1=new Cars("ferrari ","high end ",1999);
        c1.display();
    }

    void display(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    Cars(){
        brand="unknown ";
        model="NA ";
        year=000;
    }

    Cars(String brand,String model,double year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

}
