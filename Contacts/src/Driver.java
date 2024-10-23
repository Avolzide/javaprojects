import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        String[] firstName = {"Y'shtola", "Thancred", "Alisaie", "Lyse", "G'raha"};
        String[] lastName = {"Rhul", "Waters", "Leveilleur","Hext", "Tia"};
        String[] email = {"yshtola.rhul@baldesion.com", "thancred.waters@baldesion.com", "alisaie.leveilleur@baldesion.com",
                "lyse.hext@baldesion.com", "graha.tia@baldesion.com"};
        String[] phoneNum = {"2103320864","2108827635", "2106359922", "2106182234", "2103648888"};

        Scanner scan = new Scanner(System.in);
        Contacts contacts = new Contacts();

        System.out.println(contacts.printContacts());

        int button = -1;

        do{
            try {
                System.out.println();
                switch (button) {
                }
            }catch(InputMismatchException e){
                System.out.println("\nError: Please enter a valid number\n");
                scan.nextLine();
            }
        }while(button != 4);
    }

    public static void displayContactList(){

    }
    public static void searchLastName(){

    }
    public static void searchFirstName(){

    }
}
