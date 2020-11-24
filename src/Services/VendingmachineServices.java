package Services;

import java.security.PublicKey;

public class VendingmachineServices {
    String softdrink1 = "coca-cola";
    String softdrink2 = "sprite";
    String beverage1;
    String beverage2;
    public void softdrink(int chosensoftdrink) {

        String message = "Kies uw softdrink 1.coca-cola 2.sprite. U heeft gekozen voor:";
        switch (chosensoftdrink){
            case 1: message += softdrink1 + " " + "SRD 7,50" ;
            break;
            case 2: message += softdrink2 + " " + "SRD 7,50" ;
            break;
        }
        System.out.println(message);


    }
}
