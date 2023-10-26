package session5.challenges.pathfinder;

public class Maze {
    private String[][] maze;
    private String openCell = "0";
    private String explored = "X";
    private String exitPath = "*";
    private String entrance;
    private String exit;

    public Maze(String[][] maze, String entrance, String exit) {
        this.maze = maze;
        this.entrance = entrance;
        this.exit = exit;
    }

    public boolean isMoveValid(int row, int col) {
        boolean result = false;
        //check if move is inside the mazeGrid
        if (row >= 0 && row < maze.length && col >= 0 && col < maze[row].length) {
            //check if cell is open////
            if (maze[row][col] == openCell || maze[row][col] == getExit() || maze[row][col] == getEntrance()) {
                result = true;
            }
        }
        return result;
    }

    public void exploreCell(int row, int col) {
        if (maze[row][col] == getEntrance()) {
            maze[row][col] = getEntrance();
        } else if (maze[row][col] == getExit()) {
            maze[row][col] = getExit();
        } else
            maze[row][col] = explored;
    }

    public boolean hasFoundExit(int row, int col) {
        return maze[row][col] == getExit();
    }

    public void markPath(int row, int col) {
        maze[row][col] = exitPath;
    }

    //so I can print the solution
    public String toString() {
        String result = "\n";
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                result += maze[row][col] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public String getExit() {
        return exit;
    }

    public String getEntrance() {
        return entrance;
    }
}