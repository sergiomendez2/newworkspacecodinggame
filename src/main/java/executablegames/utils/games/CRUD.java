package executablegames.utils.games;

import executablegames.utils.games.players.ListOfPlayers;

import java.util.Scanner;

public class CRUD {
    ListOfPlayers listOfPlayers = new ListOfPlayers();
    Scanner scanner = new Scanner(System.in);
    public CRUD(){
    }

    public void executeCRUD(){
        System.out.println("Select an option:");
        System.out.println("1. Create player");
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
                listOfPlayers.getPlayer(10);
                break;
            case 3:
                updatePlayer();
                break;
            case 4:
                deletePlayer();
                break;
            default:

                break;
        }
    }

    private void updatePlayer(){

    }

    private void deletePlayer(){

    }
}
