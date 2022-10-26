package datatypesexcercise;
import java.util.Scanner;

public class MinorOrNot {

    public void CheckIfMinorOrNot(){
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("What is your age?");

        age = input.nextInt();
        input.close();

        if (age >= 18) 
        {
            System.out.println("The user is not a minor");
        }
        else
        {
            System.out.println("The user is a minor");
        }
        
    }
    
}
