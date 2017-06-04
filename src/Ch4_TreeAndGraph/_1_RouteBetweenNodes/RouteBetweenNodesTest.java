package Ch4_TreeAndGraph._1_RouteBetweenNodes;

import Ch4_TreeAndGraph.Graph;
import Ch4_TreeAndGraph.GraphNode;

/**
 * Created by hengwang on 2017-05-30.
 */
public class RouteBetweenNodesTest {

  public static Graph createNewGraph() {

    Graph graph = new Graph();
    GraphNode[] temp = new GraphNode[6];

    temp[0] = new GraphNode("a", 3);
    temp[1] = new GraphNode("b", 0);
    temp[2] = new GraphNode("c", 0);
    temp[3] = new GraphNode("d", 1);
    temp[4] = new GraphNode("e", 1);
    temp[5] = new GraphNode("f", 0);

    temp[0].addAdjacent(temp[1]);
    temp[0].addAdjacent(temp[2]);
    temp[0].addAdjacent(temp[3]);
    temp[3].addAdjacent(temp[4]);
    temp[4].addAdjacent(temp[5]);

    for (int i = 0; i < 6; i++) {
      graph.addGraphNode(temp[i]);
    }

    return graph;
  }


  /**
   *
   */
  public static void main(String[] args) {

    Graph g = createNewGraph();
    GraphNode[] nodes = g.getGraphNodes();

    GraphNode start = nodes[3];
    GraphNode end = nodes[5];

    RouteBetweenNodes Test = new RouteBetweenNodes();
    System.out.println(Test.findRoute(g, start, end)); // Expected: true

    GraphNode start_2 = nodes[1];
    GraphNode end_2 = nodes[5];
    System.out.println(Test.findRoute(g, start_2, end_2)); // Expected: false

  }
}
