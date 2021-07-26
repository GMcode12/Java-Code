import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        
        // this is integer input
        System.out.println("Enter an integer:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Number is:"+num);

        // this is string input
        System.out.println("Enter an string:");
        Scanner str=new Scanner(System.in);
        String name=str.nextLine();
        System.out.println("string is :"+name);


    }
    
}
