import inherit2.*;
import inherit3.*;

public class inheritance1 {


    public static void main(String[] args) {

        inherit2 obj2=new inherit2(); // Accessing class of other package ie.inherit2
        
        obj2.data("ganesh");

        inherit3 obj3=new inherit3();
        obj3.data("mahajan");
        obj3.age=20;
        obj3.dis();

    
        
    }
}
