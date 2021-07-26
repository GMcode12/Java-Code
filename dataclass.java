class myinfo{

    String name;
    int age;

    void fun()
    {
        System.out.println("Inside function:");
        System.out.println("my name is "+name+ " and age is "+age);
    }


}

public class dataclass {

    public static void main(String[] args) {

        myinfo data=new myinfo(); // object creation
        
        data.name="ganesh"; //default access modifire can be access in sam modifire
        data.age=20;
        data.fun();
      
        
    }
    
}
