

public class polymorphism {

    public static void main(String[] args) {
          
        polymorphism3 car=new polymorphism3();
        polymorphism1 mine=car;

        mine.fortuner(); //inside fortuner= because of method overriding(runtime polymorphism)
        car.fortuner(); //inside fortuner
    }

    // method (function) overloading is compile time polymorphism
    
}
