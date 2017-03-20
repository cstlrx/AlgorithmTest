package CodingInterview;

import edu.princeton.cs.algs4.In;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by lrx on 2017/3/9.
 */
// ????????
class GraphNode {
    int val;

    public GraphNode(int val) {
        this.val = val;
        this.visited = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphNode graphNode = (GraphNode) o;

        return val == graphNode.val;
    }

    boolean visited;
}// ????
class Graph {
    int v;// ??????
    int e;// ?????
    ArrayList<LinkedList<GraphNode>> graph = new ArrayList<LinkedList<GraphNode>>();

    public Graph() {

    }
    public void addV(GraphNode n) {
        LinkedList<GraphNode> node = new LinkedList<GraphNode>();
        node.add(n);
        graph.add(node);
    }
    public void addEdge(GraphNode n1, GraphNode n2) {
        //int index1 = graph.indexOf(n1);
        //int index2 = graph.indexOf(n2);
        for (LinkedList<GraphNode> l : graph) {
            if(!l.isEmpty() && l.get(0).val == n1.val){
                l.add(n2);
            }else if(!l.isEmpty() && l.get(0).val == n2.val){
                l.add(n1);
            }
        }
        e++;
    }
    // ??????????????
    public Iterable<GraphNode> getAdj(GraphNode n) {
        for (LinkedList<GraphNode> l : graph) {
            if(!l.isEmpty() && l.get(0).val == n.val){
                return l;
            }
        }
        return null;
    }
}

public class SearchGraph {
    // 广度优先遍历
    public static boolean search(Graph g , GraphNode start, GraphNode end) {
        if(start.equals(end)) {
            return true;
        }
        start.visited = true;
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(start);
        while (!queue.isEmpty()) {
            GraphNode n = queue.removeFirst();
            if(n != null) {
                if(!n.visited) {
                    if(n.equals(end))
                        return true;
                    else{
                        n.visited = true;
                    }
                }
                for (GraphNode node : g.getAdj(n)){
                    if(!node.visited)
                        queue.add(node);
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 该图1-5联通 6 独立节点
        Graph g = new Graph();
        GraphNode node1 = new GraphNode(1);
        g.addV(node1);
        g.addV(new GraphNode(2));
        GraphNode node2 = new GraphNode(2);
        g.addV(node2);
        GraphNode node3 = new GraphNode(3);
        g.addV(node3);
        GraphNode node4 = new GraphNode(4);
        g.addV(node4);
        GraphNode node5 = new GraphNode(5);
        g.addV(node5);
        GraphNode node6 = new GraphNode(6);
        g.addV(node6);
        g.addEdge(node1,node2);
        g.addEdge(node1,node3);
        g.addEdge(node2,node4);
        g.addEdge(node3,node5);
//        Iterable<GraphNode> i = g.getAdj(node2);

//        Iterator<GraphNode> ite = i.iterator();
//        while (ite.hasNext()) {
//            System.out.print(ite.next().val + " ");
//        }
        System.out.println(search(g,node1,node6));

    }
}
