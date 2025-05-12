package Oops;

import java.util.SortedMap;

public class Constructors {

    String name;

    Constructors(String name){
        this.name=name;
    }


    void showName(){
        System.out.println(name);

    }

    public static void main(String[] args) {

        Constructors c=new Constructors("Saikrishna");
        c.showName();


    }
}
