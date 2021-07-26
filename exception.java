import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception {

     // one method of exception landeling:: thrown declaration
     // public static void main(String[] args) throws FileNotFoundException{

     //      File file=new File("text.txt");

     //      Scanner readfile= new Scanner(file);
          
     // }
    
     // Another method of exception handeling:: try and catch  

     public static void main(String[] args) {
          
          File file=new File("text.txt");
          try {
               Scanner newfile= new Scanner(file);

               //After founding file
               System.out.println("File  found:"+file.toString());
               
          } catch (FileNotFoundException e) {
               //TODO: handle exception
               // e.printStackTrace();
               // We can also add my our own out statments

               System.out.println("File not found:"+file.toString());



          }
               
          
     }
    
}
