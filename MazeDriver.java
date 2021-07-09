import java.util.ArrayList;
import java.util.Scanner;

/* @Author Tom Mackinson
 * Implementation of Breadth first search for pathfinding
 * Uses a standard set of mazes, stored in ./Mazes
 *
 * In a maze
 * -1 is the starting point
 * -2 is the ending point
 * any other positive non 0 value is a valid space
 * The idea here is to simulate how mazes might work for a GPS system,
 * with higher numbers representing a road with a higher speed limit.
 * Just like in real life, the shortest distance path might not be the most desirable,
 * Thus this program is also going to examine the "Travelling salesman problem"
 * Finding the fastest route from a list of valid routes
 */

public class MazeDriver{
  // The purpose of the driver is simply to load in the target maze from memory, then run that maze with each search algorithm
  // The driver will then output statistics from each algo, such as run time and found path distance

    public static void main(String args[]){

      Scanner input = new Scanner(System.in);

      ArrayList maze = new ArrayList();
      while(input.hasNext()){
        maze.add(input.nextInt());
      }
      String[] results = BFS.runMaze(maze);

    }

}
