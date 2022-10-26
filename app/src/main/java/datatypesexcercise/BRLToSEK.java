package datatypesexcercise;

import java.util.Scanner;

public class BRLToSEK {

    public void ConvertBRLToSEK(){
        Scanner BRLinput = new Scanner(System.in);
        int BRL;
        float SEK;

        System.out.println("Please choose a value of BRL");
        BRL = BRLinput.nextInt();
        BRLinput.close();

        SEK = BRL * 2.64f;

        System.out.println("The converted value is " + SEK + " SEK");

    }
    


}
