public class inter {

    public static void main(String[] args) {
//***********concept of anonymous classes**********
System.out.println("*****concept of anonymous classes***");

        vehcompinterface interobj=new vehcompinterface(){
            
            public void information()
            {
                System.out.println("We are showing inside anonymous class......\n");
            }
        };

        interobj.information();


    //**********concept of interface********
    System.out.println("****concept of interface*****");
    computer dell=new computer();
    dell.start();

    vehicle honda=new vehicle();
    honda.start();

    vehcompinterface info=new vehicle(); //creating new object of interface referece to the vehicle class
    vehcompinterface car=honda;
    info.information();//Vehicle number is :254
    car.information();

    vehcompinterface hp=dell;
    vehcompinterface lenevo=new computer();

    hp.information();//Computer serial number is:1231
    lenevo.information();

    }
        
   
}
