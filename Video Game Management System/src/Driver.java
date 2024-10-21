import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        ArrayList<VideoGame> theVideoGame = new ArrayList<VideoGame>();

        addGame(theVideoGame);
    }
    public static void addGame(ArrayList<VideoGame> addVideoGame){

        Scanner scan = new Scanner(System.in);

        String title;
        String genre;
        String platform;
        String price;

        System.out.println("\nEnter the game's title: ");
        title = scan.nextLine();
        System.out.println("What is the game's genre: ");
        genre = scan.nextLine();
        System.out.println("Which platform is it played on: ");
        platform = scan.nextLine();
        System.out.println("How much does it cost: ");
        price = scan.nextLine();
    }
    public static void displayInventory(ArrayList<VideoGame> displayVideoGame) {
        for (VideoGame videoGame : displayVideoGame) {
            System.out.println("**** Current Inventory *****");
            System.out.println(displayVideoGame);
        }
    }
}
