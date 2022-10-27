package datatypesexcercise;

import java.util.Scanner;

public class TempConvert {

    public void ConvertTemp(){
        float c;
        float f;

        Scanner tempInput = new Scanner(System.in);

        System.out.println("Choose a temperature in Celsius");

        c = tempInput.nextFloat();
        tempInput.close();

        f = (c * 9/5) + 32;

        System.out.println(c + " Celsius is " + f +" Farenheit");
    }
}
