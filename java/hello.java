class Vehicle1{
    void run3(){System.out.println("vehicle is the parent class");}
    }
    class Bike1 extends Vehicle1{
    void run2(){System.out.println("Bike has some properties of a vehicle");}
    }
    class Cycle extends Bike1{
    void run1(){System.out.println("Cycle has some properties of Bike");}
    }
    public class hello{
    public static void main(String[] args){
    Cycle d = new Cycle();
    d.run1();
    d.run2(); 
    d.run3(); } }