package mining_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class miningApp {

    public static void main(String[] args) {
        List<String> asteroid = new ArrayList<>(List.of("#", "#", "#", "*", "#", "*", "*"));
        List<String> track = new ArrayList<>(List.of("^", "_", "_", "_"));
        List<String> gameCommands = new ArrayList<>(List.of("a", "d", "m", "t", "q", "c"));
        boolean isGameRunning = true;
        Scanner scanner = new Scanner(System.in);

        Robot robo = new Robot(track, asteroid);
        System.out.println("Starting game, commands: left - a, right - d, mine - m, add track - t, check cargo -c, quit - q");
        System.out.println(asteroid);
        System.out.println(track);

        playGame(robo,gameCommands, scanner);
    }
    public static void playGame(Robot robo, List<String> gameCommands, Scanner scanner){
        boolean isGameRunning = true;

        while (isGameRunning){
            String command = scanner.next();
            if(gameCommands.contains(command)){
                robo.move(command);
                robo.layTrack(command);
                robo.mine(command);
                robo.printCargo(command);
                robo.printGameStatus();

                //quit game condition
                if(command.equals("q")){
                    isGameRunning = false;
                    System.out.println("Game ended.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
