package Oops.encapsulation;

public class Student {

    private  String name;
    private  int age;

    //Setter method for name
    public void setName(String name){
        this.name=name;
    }
    //getter method for name
    public String getName(){
        return name;
    }
    //Setter method for age
    public void setAge(int age){
        this.age=age;
    }
    //getter method for age
    public int getAge(){
        return age;
    }


}

/* --------Encapsulation ------------
Encapsulation is the process of hiding internal data and allowing access to it only through public methods.

In Java, encapsulation is implemented by :
Declaring variables as private
Providing getters and setters to access/update them

 */


/*✅ Real-life analogy: Think of a vending machine

The internal state is things like how much money is inside, how many snacks are left.
You can't just reach in and grab snacks — you use buttons (public methods) to get them in a controlled way.*/
