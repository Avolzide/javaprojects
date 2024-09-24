/*
David Cortinez
09/19/2024
COSC-1437-001
* Purpose: To encapsulate the concept of sport team using getters and setters, constructors, classes,
* user interaction and math */
/*
---Outline------------------------------------------------------------------------------
* Create a Sport class
* List out private variables from lab instructions
* Use Getter and setters for each variable
* Make a getter only for the win loss ratio
* Create a driver main file with the java scanner class for user i/o
 ---------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //User inputs
        System.out.println("Enter Team Name: ");
        String teamName = scan.nextLine();
        System.out.println("Enter Number of Wins: ");
        int wins = scan.nextInt();
        System.out.println("Enter Number of Losses: ");
        int losses = scan.nextInt();
        System.out.println("Enter Number of Players on Team: ");
        int numPlayers = scan.nextInt();

        Sport sport = new Sport(teamName, wins, losses, numPlayers);

        //Prints output
        System.out.println("Team Name is " + sport.getName());
        System.out.println(sport.getSeasonWins() + " wins");
        System.out.println(sport.getSeasonLosses() + " losses");
        System.out.println(sport.getNumberOfPlayers() + " players in team");
        System.out.println(sport.getWinLossRatio() + " W/L Ratio for the season");
    }
}