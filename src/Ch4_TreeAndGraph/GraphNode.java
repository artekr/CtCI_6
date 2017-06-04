package Ch4_TreeAndGraph;

/**
 * Created by hengwang on 2017-06-04.
 */
public class GraphNode {

  private GraphNode adjacent[];
  public int adjacentCount;
  private String vertex;

  public enum State {
    Unvisited,
    Visited,
    Visiting;
  }

  /**
   * Graph Node constructor
   * @param vertex
   * @param adjacentLength
   */
  public GraphNode(String vertex, int adjacentLength) {
    this.vertex = vertex;
    adjacentCount = 0;
    adjacent = new GraphNode[adjacentLength];
  }

  public void addAdjacent(GraphNode n) {
    if (adjacentCount < adjacent.length) {
      this.adjacent[adjacentCount] = n;
      adjacentCount++;
    } else {
      System.out.println("No More adjacent can be added");
    }
  }

  public GraphNode[] getAdjacent() {
    return adjacent;
  }

  public String getVertex() {
    return vertex;
  }

}