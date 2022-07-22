package executableGames;

import executableGames.games.Game;
import executableGames.players.ListOfPlayers;
import executableGames.players.ListOfResults;
import games.HangManGame.hangman.HangedMan;
import main.java.games.ttt.TicTacToe;

import java.util.Scanner;

public class MainGames {
    private Game[] games;
    private ListOfPlayers listOfPlayers;
    private ListOfResults listOfResults;
    private CRUD crud;
    private Statistics statistics;

    Scanner scanner = new Scanner(System.in);

    public MainGames() {
    }

    public void printMenu() {
        System.out.println("---------- Menu ----------");
        System.out.println("1. Play");
        System.out.println("2. Player's CRUD");
        System.out.println("3. Statistics");
        System.out.println("4. Exit");
        System.out.println("\nSelect an option:");
        executeOption();
    }

    private void printGameOptions() {
        System.out.println("Select game: ");
        System.out.println("1. TicTacToe");
        System.out.println("2. HangedMan");
        System.out.println("3. Back to Menu");
        System.out.println("\nSelect an option:");
    }

    private void executeOption() {
        int option;
        option = scanner.nextInt();

        switch (option) {
            case 1:
                printGameOptions();
                option = scanner.nextInt();
                private void printGameOptions () {
                System.out.println("Select game: ");
                System.out.println("1. TicTacToe");
                System.out.println("2. HangedMan");
                System.out.println("3. Back to Menu");
                System.out.println("\nSelect an option:");
            }

            private void executeOption () {
                int option;
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        printGameOptions();
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                //TicTacToe ticTacToe = new TicTacToe();
                                //ticTacToe.execute();
                                break;
                            case 2:
                                HangedMan hangedMan = new HangedMan();
                                //hangedMan.execute();
                                break;
                            default:
                                printMenu();
                                break;
                        }
                        break;
                    case 2:
                        CRUD crud = new CRUD();
                        crud.executeCRUD();
                        break;
                    case 3:
                        Statistics statistics = new Statistics();
                        //statistics.showStatistics();
                        break;
                    default:
                        System.out.println("Thanks for playing :D");
                        break;
                }
            }
        }
    }
}