package Graph;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdges(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    String printGraph() {
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }

//    get nodes
//    Arguments: none
//    Returns all of the nodes in the graph as a collection (set, list, or similar)

    Set getnodes() {
        StringBuilder strBuilder = new StringBuilder();
        Set nodes = new HashSet();

        for (Vertex vertex : adjVertices.keySet()) {
            nodes.add(vertex);
        }
        return nodes;
    }

    public void removeVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(vertex);

    }

    public void removeEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeList1 = adjVertices.get(vertex1);
        List<Vertex> edgList2 = adjVertices.get(vertex2);

        if (!edgeList1.isEmpty()) {
            edgeList1.remove(vertex2);
        }

        if (!edgList2.isEmpty()) {
            edgList2.remove(vertex1);
        }
    }

    public Set<String> bfs(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : getNeighbors(new Vertex(vertex))) {
                if (!visited.contains((v.data))) {
                    queue.add(v.data);
                    visited.add(v.data);

                }
            }
        }
        return visited;
    }

    public List<Vertex> getAdjVertices(String data) {
        return adjVertices.get(new Vertex(data));
    }


    //    size Arguments: none
//    Returns the total number of nodes in the graph
    public int size() {
        return adjVertices.size();
    }

    //    get neighbors
//    Arguments: node
//    Returns a collection of edges connected to the given node
//    Include the weight of the connection in the returned collection
    public List<Vertex> getNeighbors(Vertex vertex) {
        return adjVertices.get(vertex);
    }

}