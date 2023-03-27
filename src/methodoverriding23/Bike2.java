package methodoverriding23;

/**
 * 23. Example of method overriding
 */
public class Bike2 extends Vehicle{
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        Vehicle obj1=new Vehicle();
         obj1.run();
        obj.run();

    }
}
