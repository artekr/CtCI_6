package Ch4_TreeAndGraph._1_RouteBetweenNodes;

import Ch4_TreeAndGraph.Graph;
import Ch4_TreeAndGraph.GraphNode;

import java.util.LinkedList;

/**
 * Created by hengwang on 2017-05-30.
 *
 * This problem can be solved by just simple graph traversal, such as depth-first search or breadth-first search.
 * We start with one of the two nodes and, during traversal, check if the other node is found.
 * We should mark any node found in the course of the algorithm as "already visited" to avoid cycles and repetition of the nodes.
 *
 */
public class RouteBetweenNodes {

  /**
   * Using Breath First Search
   * @param g
   * @param start
   * @param end
   * @return
   */
  public boolean findRoute(Graph g, GraphNode start, GraphNode end) {

    LinkedList<GraphNode> q = new LinkedList<>();

    for (GraphNode n : g.getGraphNodes()) {
      n.state = GraphNode.State.Unvisited;
    }
    start.state = GraphNode.State.Visiting;
    q.add(start);

    while (!q.isEmpty()) {
      GraphNode node = q.removeFirst();
      if (node != null) {
        for (GraphNode v : node.getAdjacent()) {
          if (v.state == GraphNode.State.Unvisited) {
            if (v == end) {
              return true;
            } else {
              v.state = GraphNode.State.Visiting;
              q.add(v);
            }
          }
        }
        node.state = GraphNode.State.Visited;
      }
    }

    return false;
  }
}
