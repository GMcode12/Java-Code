

class student
{
    static int count; //for counting object

    public student()
    {
        count++;
    }
    static final int age=20; // declaration of contant variable
    String myname;  //instance variable
    static String name; //also called as class variable creats copy of only time for all objects

    void info()
    {
        System.out.println(myname);
        System.out.println(name);    //non static function can access the static data member.
    }

    static void data()
    {
        // System.out.println(myname);
        // non-static variable myname cannot be access in static function
        System.out.println(name); 
    }
    

}
public class staticandfinal {
    
    public static void main(String[] args) {
        
        student.name="jadhav"; //will assign for all objects.
        System.out.println(student.name);
        
        student.count=0;
        System.out.println("Befor creating object:"+student.count);
        student s1=new student();
        student s2=new student();
        System.out.println("After creating object:"+student.count);
        

        s1.myname="ganesh";
        s2.myname="mahajan";

        


        s1.info();
        s2.info();

        // Math.E=20.45; cannot change constant
        System.out.println(Math.E);
        // student.age=20; cant be change
        System.out.println(student.age);


    }
}
