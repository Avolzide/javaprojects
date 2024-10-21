import javax.swing.text.html.HTML;
import java.util.Scanner;

public class vDriver {
    public static void main(String[] args) {

        String characterName;
        String characterType;
        int hitPoints;
        String gameName;
        String genre;
        String studioName;
        String location;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter your character name: ");
        characterName = scan.nextLine();

        System.out.println("\nEnter your character class: ");
        characterType = scan.nextLine();

        System.out.println("\nAdd character's hit point value: ");
        hitPoints = scan.nextInt();

        System.out.println("\nWhat's the video game name: ");
        gameName = scan.nextLine();

        System.out.println("\nWhat's it's genre: ");
        genre = scan.nextLine();

        System.out.println("\nWhat's the studio name: ");
        studioName = scan.nextLine();

        System.out.println("\nWhat's the studio's location: ");
        location = scan.nextLine();

        TaganistCharacter character = new TaganistCharacter(characterName, characterType, hitPoints);
        VideoGame videoGame = new VideoGame(gameName, genre);
        GameStudio gameStudio = new GameStudio(studioName, location);

        System.out.println(character.printCharacter() + "\n" + videoGame.printVideoGame() + "\n" + gameStudio.printStudio() + "\n");


    }
}
