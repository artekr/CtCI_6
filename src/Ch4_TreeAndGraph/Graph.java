package Ch4_TreeAndGraph;

/**
 * Created by hengwang on 2017-06-04.
 */
public class Graph {

  public static int MAX_VERTICES = 6;
  private GraphNode vertices[];
  public int count;

  /**
   * Graph constructor
   */
  public Graph() {
    vertices = new GraphNode[MAX_VERTICES];
    count = 0;
  }

  public void addGraphNode(GraphNode n) {
    if (count < vertices.length) {
      vertices[count] = n;
      count++;
    } else {
      System.out.println("Graph is full");
    }
  }

  public GraphNode[] getGraphNodes() {
    return vertices;
  }
}
