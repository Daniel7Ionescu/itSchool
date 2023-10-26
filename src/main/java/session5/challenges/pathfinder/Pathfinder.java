package session5.challenges.pathfinder;

public class Pathfinder {
    private Maze maze;

    public Pathfinder(Maze maze) {
        this.maze = maze;
    }

    public boolean mazeRunner(int row, int col) {
        boolean result = false;

        //can move in next cell?
        if (maze.isMoveValid(row, col)) {
            //if yes mark it
            maze.exploreCell(row, col);
            //is the cell the exit?
            if (maze.hasFoundExit(row, col)) {
                result = true;
            }

            //if we haven't found the exit then we explore around : up/right/down/left
            else if (!result) {
                result = mazeRunner(row - 1, col);
                if (!result) {
                    result = mazeRunner(row, col + 1);
                    if (!result) {
                        result = mazeRunner(row + 1, col);
                        if (!result) {
                            result = mazeRunner(row, col - 1);
                        }
                    }
                }
            }
            //if we found the exit, mark the path
            if (result) {
                maze.markPath(row, col);
            }
        }
        return result;
    }
}
