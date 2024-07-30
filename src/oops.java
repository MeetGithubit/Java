
/*class Student{
    String Name;
    int Age;

    public void printinfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
}



}
public class oops {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.Name = "Meet";
        s1.Age = 24;

        
    }

    
}

class Student1{
    String Name;
    int Age;

    public void printinfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }



// non parameter constructor  che
Student1(){
    System.out.println("consructor");

}

public class oops1 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.Name = "Meet";
        s1.Age = 24;

        
    }
}
}*/


/*class Student2{
    String Name;
    int Age;

    public void printinfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }
//  parameter constructor  che
Student2(String name, int age){
    this.Name= name;
    this.Age =age;

}
}
public class oops {
    public static void main(String[] args) {
        Student2 s1= new Student2("Meet", 24);
        s1.printinfo();
        
        

        
    }
}*/

/*class student{
    String name;

    int age;

    public  void printinfo(String name){
        System.out.println(name);
    
       
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name,int age){
        System.out.println(name + " " + age);
    }

}

public class oops {

    public static void main(String[] args) {
       student s1 =new student();
       s1.name = "Meet";
       s1.age =24;

       s1.printinfo(s1.name);
       s1.printinfo(s1.age);
       s1.printinfo(s1.name, s1.age);

       
       
        
    }
    
}*/

// INHERITANCE

/*class shape{
    String color;
}

class triangle extends shape{

}
class oops{
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color ="red";

        System.out.println(t1.color);
        
    }
}*/


// single level inheritence



/*class shape{
    public void area(){
        System.out.println("Display area");
    }
}

class triangle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }


}
// multilevel inheritence
class equilatertriangle extends triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

// hirachical inheritence

class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
}
}


public class oops {
    public static void main(String[] args) {
        
        
    }

    
}*/





 /*class Account{
    public String name;
    protected String email;
    private String Password;

    // private two type 
    // getter and setter
    public String getPassword(){
        return this.Password;

    }

    public void setPassword(String pass){
        this.Password = pass;
    }

}

public class oops{
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.name= "Meet";
        A1.email ="meet@gmail.com";
        A1.setPassword("abcd");
        System.out.println(A1.getPassword());
        
    
        
    }
}*/
// pure abstraction na kevay because aa Abstract class badhi information hide nahi kare
/*abstract class Animal{
    abstract void walk();
    //constructor
    Animal(){
        System.out.println("you are creating a new animal");
    }
    // non-abstract method
    public void eat(){
        System.out.println("Animal eat");
    }

    
}

class Horse extends Animal{
    // constructor  it means consrtuctor chaining
    Horse(){
        System.out.println("create a horse");
    }
    public void walk(){
        System.out.println("Walk on 4 leg");
}
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 leg");
    }
}

public class oops{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        
    }
}*/
/**
 * Inneroops
 */
/*interface Animal{
    int eyes =2;
    // Abstract function
   public void walk();
   

}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 leg");

    }
    

}

public class oops{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        
    }
}*/

class student{
    String name;
   static String school;
}


public class oops{
    public static void main(String[] args) {
        student.school= "Mangalddep";
        student s = new student();
        System.out.println(s.school);
    }
}


