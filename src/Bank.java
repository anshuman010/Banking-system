
import java.io.IOException;

public class Bank {

    public static void main(String[] args) throws IOException {
        OptionMenu optionMenu = new OptionMenu();
        introduction();
        optionMenu.mainMenu();
    }
    public static void introduction(){
        System.out.println("WELCOME TO THE BANK! ");
    }
}