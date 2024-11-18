import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Tasks> taskManager = new ArrayList<Tasks>();

        Scanner scan = new Scanner(System.in);

        String enterTask;
        String enterDescription;
        String enterDueDate;
        int enterPriority;

        System.out.println("Enter name of task: " );
        enterTask = scan.nextLine();

        System.out.println("Enter a description: ");
        enterDescription = scan.nextLine();

        System.out.println("Enter the due date: ");
        enterDueDate = scan.nextLine();

        System.out.println("What's it's priority level: ");
        enterPriority = scan.nextInt();

        //taskManager.add(new Tasks(enterTask, enterDescription, enterDueDate, enterPriority));
        int press = -1;
        switch(press){

            case 1:
                System.out.println("(1) Show task list");
                break;
            case 2:
                System.out.println("(2) Show task list by priorities");
                break;
            case 3:
                System.out.println("(3) List by due date");
                break;
            case 4:
                System.out.println("(4) Sort by alphabetical");
                break;
            case 5:
                System.out.println("Exiting...");
            default:
                System.out.println("What went wrong?");

        }while(press != 5);
    }

    public static void searchByTitle(ArrayList<Tasks> taskSearch){



    }
}
