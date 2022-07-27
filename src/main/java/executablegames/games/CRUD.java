package executablegames.games;

import executablegames.games.players.ListOfPlayers;
import executablegames.games.players.Player;

import java.util.Arrays;
import java.util.Scanner;


public class CRUD {
    ListOfPlayers listOfPlayers = new ListOfPlayers();
    Scanner scanner = new Scanner(System.in);
    public CRUD(){
    }

    public void executeCRUD(){
        System.out.println("Select an option:");
        System.out.println("1. Create players");
        System.out.println("2. Show players");
        System.out.println("3. Update player");
        System.out.println("4. Delete player");
        System.out.println("5. Back to home");
        int option = scanner.nextInt();

        switch(option){
            case 1:
                listOfPlayers.createPlayer();
                break;
            case 2:
                printPlayers();
                break;
            case 3:
                updatePlayer();
                break;
            case 4:
                deletePlayer();
                break;
            default:
                MainGames mainGames = new MainGames();
                mainGames.printMenu();
                break;
        }
        executeCRUD();
    }

    private void printPlayers(){
        System.out.println("---Players---");
        for (int i = 0; i < 10; i++){
            System.out.println(listOfPlayers.getSinglePlayer(i).toString());
        }
    }

    private void updatePlayer(){
        int idPlayer;
        printPlayers();
        System.out.println("Insert player's Id:");
        idPlayer = scanner.nextInt();

        for(int i=0; i<listOfPlayers.getPlayers().length; i++){
            if(listOfPlayers.getSinglePlayer(i).getId()==(idPlayer)){
                String tempName = listOfPlayers.getSinglePlayer(i).getName();
                System.out.println("Insert new name:");
                String newName = scanner.next();
                listOfPlayers.getSinglePlayer(i).setName(newName);
                System.out.println(tempName + "was changed to " + newName + "successfully");
            }
        }
    }

    private void deletePlayer(){
        int idPlayer;
        printPlayers();
        System.out.println("Insert player's Id:");
        idPlayer = scanner.nextInt();

        for(int i=0; i<listOfPlayers.getPlayers().length; i++){
            if(listOfPlayers.getSinglePlayer(i).getId()==(idPlayer)){
                String tempName = listOfPlayers.getSinglePlayer(i).getName();
                Player tempList[] = listOfPlayers.getPlayers();
                Player tempPlayer = listOfPlayers.getSinglePlayer(i);
                Player[] newList = Arrays.stream(tempList).filter(s->!s.equals(tempPlayer)).toArray(Player[]::new);
                listOfPlayers.setPlayers(newList);
                System.out.println(tempName + "was deleted successfully");
            }
        }
    }
}

