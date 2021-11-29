import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {

    /**
     * Represents nodes of a graph.
     * Node contains a string value.
     */
    private class Node{
        private String label;
        private List<Edges> edges = new ArrayList<>();

        /**
         * Initiates the class
         * @param label name of the node.
         */
        public Node(String label) {
            this.label = label;
        }

        public void addEdge(Node to, int weight){
            edges.add(new Edges(this, to, weight));
        }

        public List<Edges> getEdges(){
            return edges;
        }
        @Override
        public String toString() {
            return label;
        }
    }

    private class Edges{
        private Node from;
        private Node to;
        int weight;

        @Override
        public String toString() {
            return from + "->" + to;
        }

        public Edges(Node from, Node to, int weight){
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edges>> edges = new HashMap<>();

    public void addNode(String value){
        Node newNode = new Node(value);
        nodes.putIfAbsent(value,newNode);
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        fromNode.addEdge(toNode,weight);
        toNode.addEdge(fromNode,weight);
    }

    public void print(){
        for(Node node : nodes.values()){
            List<Edges> edges = node.getEdges();
            System.out.println(node + " is connected to " + edges);
        }
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","D",10);
        graph.print();
    }


}
