import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Graph contains nodes - the dots in the graph
 * and edges - the lines in the graph
 */
public class Graph {

    /**
     * Represents nodes of a graph.
     * Node contains a string value.
     */
    private class Node{
        private String label;

        /**
         * Initiates the class
         * @param label name of the node.
         */
        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }
    private Map<String,Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjNodes = new HashMap<>();

    /**
     * Adds a new node to the graph.
     *
     * @param value
     */
    public void addNode(String value){
        Node newNode = new Node(value);
        nodes.putIfAbsent(value,newNode);
        adjNodes.putIfAbsent(newNode,new ArrayList<>());
    }

    /**
     * Adds a edge. Every edge must have a from node
     * and a to node. It will be also added in a list of adjacent nodes.
     * @param from node from where the edge starts
     * @param to node to which edge goes.
     */
    public void addEdge(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        adjNodes.get(fromNode).add(toNode);
    }

    /**
     * Removes a node from graph.
     * @param label name of the node to be removed.
     */
    public void removeNode(String label){
        if(nodes.get(label) == null){
            return;
        }

        for(Node node : adjNodes.keySet()){   // Gets all the nodes
            adjNodes.get(node).remove(node);  // Gets all the adjacent nodes and removes.
            adjNodes.remove(node);            // Removes the node from nodes list
            nodes.remove(node);
        }
    }

    public void removeEdge(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        adjNodes.get(fromNode).remove(toNode);
    }

    public void print(){
        for(Node source:adjNodes.keySet()){
            List<Node> targets = adjNodes.get(source);
            if(!targets.isEmpty()){
                System.out.println(source + " is connected to " + targets);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","D");
        graph.print();
    }

}
