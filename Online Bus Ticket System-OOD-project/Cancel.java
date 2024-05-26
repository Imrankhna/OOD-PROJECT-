import java.util.Scanner;

public class Cancel{
    Scanner scanner = new Scanner(System.in);
    void cancel(String name, int total){
     if(name.equals(null)) return;
        System.out.println("Enter Your Name: ");
        String name1=scanner.nextLine();
        if(name1.equals(name)){
            System.out.println("Returned Money "+total);
            System.out.println("Cancel Completed");
        }
        else System.out.println("Invalid Name");
    }
}
