package mining_operations;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private List<String> track;
    private List<String> asteroid;
    private List<String> cargo = new ArrayList<>();


    public Robot(List<String> track, List<String> asteroid) {
        this.track = track;
        this.asteroid = asteroid;
    }

    public void move(String input) {
        int index = track.indexOf("^");
        //right
        if (input.equals("d")) {
            track.set(index + 1, "^");
            track.set(index, "_");
        }
        //left
        else if (input.equals("a")) {
            track.set(index - 1, "^");
            track.set(index, "_");
        }
    }

    public void layTrack(String input) {
        int index = track.indexOf("^");
        if (input.equals("t")) {
            if (index == track.size() - 1) {
                track.add("_");
                System.out.println("Added track");
            }
            //not at end of track
            else System.out.println("Need to be at end of track");
        }
    }

    public void mine(String input) {
        int index = track.indexOf("^");
        if (input.equals("m")) {
            if (asteroid.get(index).equals("#")) {
                cargo.add(asteroid.get(index));
                asteroid.set(index, "0");
            } else if (asteroid.get(index).equals("*")) {
                cargo.add(asteroid.get(index));
                asteroid.set(index, "!");
            }
        }
    }

    public void printCargo(String input) {
        if (input.equals("c")) {
            System.out.println("Cargo contents: " + cargo);
        }
    }

    public void printGameStatus(){
        System.out.println(asteroid);
        System.out.println(track);
    }
}
