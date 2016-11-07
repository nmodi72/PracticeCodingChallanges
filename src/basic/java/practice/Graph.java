package basic.java.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    public static GraphNode rootNode;

    public Graph(GraphNode rootNode) {
        this.rootNode = rootNode;
    }
//
//    public void dfs() {
//        // DFS uses Stack data structure
//        Stack s = new Stack();
//        s.push(this.rootNode);
//        rootNode.visited = true;
//        printNode(rootNode);
//        while (!s.isEmpty()) {
//            Node n = (Node) s.peek();
//            Node child = getUnvisitedChildNode(n);
//            if (child != null) {
//                child.visited = true;
//                printNode(child);
//                s.push(child);
//            } else {
//                s.pop();
//            }
//        }
//        // Clear visited property of nodes
//        clearNodes();
//    }
//    
//    public void bfs(){
//        // BFS uses queue data structure
//        Queue queue = new LinkedList<>();
//        queue.add(this.rootNode);
//        printNode(rootNode);
//        rootNode.visited = true;
//        while(!queue.isEmpty()) {
//            Node n = (Node) queue.remove();
//            Node child = null;
//            while((child = getUnvisitedChildNode(n)) ! null) {
//                child.visited = true;
//                printNode(child);
//                queue.add(child);
//            }
//        }
//        clearNodes();
//    }
    
}

// Graph Node
class GraphNode {
    char data;
    
    public GraphNode(char c) {
        this.data = c;
    }
}
