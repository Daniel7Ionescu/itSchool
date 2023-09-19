package session5.challenges.pathfinder;

public class PathfindingInAMaze {

    public static void main(String[] args) {
        String[][] maze1 = {
                {"S", "1", "0", "1"},
                {"0", "0", "0", "1"},
                {"0", "1", "0", "1"},
                {"0", "0", "0", "E"}
        };

        String[][] maze2 = {
                {"S", "1", "0", "1", "1"},
                {"0", "1", "E", "0", "1"},
                {"0", "1", "1", "0", "1"},
                {"0", "1", "1", "0", "1"},
                {"0", "0", "0", "0", "1"}
        };

        Maze maze = new Maze(maze2, "S", "E");
        Pathfinder pathfinder = new Pathfinder(maze);

        //an array to hold the starting row/col so I can move the start symbol around
        int[] startCoords = findStart(maze2, "S");

        if (pathfinder.mazeRunner(startCoords[0], startCoords[1])) {
            System.out.println("I escaped!");
        } else {
            System.out.println("The is no escape human!");
        }

        System.out.println(maze);
    }

//    ========UTILS==========

    public static int[] findStart(String[][] maze, String startSymbol) {
        int[] startCoords = new int[2];

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (maze[row][col] == startSymbol) {
                    startCoords[0] = row;
                    startCoords[1] = col;
                }
            }
        }
        return startCoords;
    }
}