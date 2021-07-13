import java.util.ArrayList;


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

public class BFS{

    public static void runMaze(ArrayList<Integer> maze){
      boolean visited[] = new boolean[V];

      LinkedList<Integer> queue = new LinkedList<Integer>();

      visited[s] = true;
      queue.add(s);

      while(queue.size() != 0){
        s = queue.poll();
        System.out.print(s + " ");

        IteratorMInteger i = adj[s].listIterator();
        while (i.hasNext()) {
          int n = i.next();
          if(!visited[n]) {
            visited[n] = true;
            queue.add(n);
          }
        }
      }
    }

}
