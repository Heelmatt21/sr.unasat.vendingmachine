package App;
import Services.VendingmachineServices;

public class Application {
    public static void main(String[] args) {
        VendingmachineServices vm = new VendingmachineServices();
        vm.softdrink(1);
    }
}
