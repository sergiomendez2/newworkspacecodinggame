package executablegames.games;

import executablegames.games.ttt.game.Game;

import java.util.Scanner;

public class MainGames {
    private CRUD crud;
    Game gameTTT = new Game();
    Statistics statistics = new Statistics();
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
        System.out.println("Hola mundo");
    }

    private void printGameOptions() {
        System.out.println("Select game: ");
        System.out.println("1. TicTacToe");
        System.out.println("2. HangedMan");
        System.out.println("3. Back to Menu");
        System.out.println("\nSelect an option:");
    }

    public void executeOption(){
        int option = scanner.nextInt();

        switch (option){
            case 1:
                printGameOptions();
                int gameOption = scanner.nextInt();
                switch (gameOption){
                    case 1:
                        //gameTTT.play();
                        break;
                    case 2:
                        //llamar hangman
                        break;
                    default: printMenu(); break;
                }
                break;
            case 2:
                crud.executeCRUD();
                break;
            case 3:
                statistics.showStatistics();
                break;
            default: System.out.println("Thanks for playing... :D"); break;
        }
    }
}