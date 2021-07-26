class data
{
    int age;
    String name;

    public data()
    {
        this(5);  //this() is used to call another constructor and always declared in first line of costructor. it will call the constructor... data(int age)
        System.out.println("first constructor");
        age=20;
    }

    public data(int age)
    {
        this(20,"ganesh");
        this.age=age; // (this) is used to tell that age is instant variable of class
        System.out.println("second constructor");
    }

    public data(int age, String name)
    {
        this.age=age;
        this.name=name;
        System.out.println("this is third constructor");

    }

}



public class constructor {

    public static void main(String[] args) {
        
        data data1=new data();
        data data2=new data(20);
        data data3=new data(30,"ganesh");

    }
    
}
