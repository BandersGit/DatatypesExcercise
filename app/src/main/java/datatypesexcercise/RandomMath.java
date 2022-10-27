package datatypesexcercise;

import java.util.Scanner;

public class RandomMath {
    
    public void CalculateNumbers(){
        float a;
        float b;

        Scanner numberInput = new Scanner(System.in);

        System.out.println("Choose the first number");

        a = numberInput.nextFloat();

        System.out.println("Choose the second mumber");

        b = numberInput.nextFloat();
        numberInput.close();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " * " + b + " = " + (a*b));
    }
}
