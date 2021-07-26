public class casting {

    public static void main(String[] args) {
        
        int intval=756;
        long longval=98765;
        float floatval=452.45f;
        short shortval=87;
        double doubleval=5846.4251;
        byte byteval=52;

        System.out.println(shortval);

        intval=(int) longval; //cant convert long to int hence need casting.
        System.out.println(intval);
        intval=(int) doubleval; //conever double to int
        System.out.println(intval);
        



    }
    
}
