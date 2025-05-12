package Oops;

public class ConstructorChaining {

    public static void main(String[] args) {
        ConstructorChaining c=new ConstructorChaining();
        c.display();
        ConstructorChaining c1=new ConstructorChaining("sai",24);
        c1.display();
        ConstructorChaining c2=new ConstructorChaining("Krishna",25,'A');
        c2.display();
    }
    String name;
    int age;
    char grade;

    ConstructorChaining(){
        name="unkown";
        age=0;
        grade='n';
    }

    ConstructorChaining(String name,int age){
        this.name=name;
        this.age=age;
    }

    ConstructorChaining(String name,int age,char grade){
        this(name,age);
        this.grade=grade;
    }

    void display(){
        System.out.println("Name : "+ name +", Age : "+ age+ " Grade : "+grade  );
    }
}
