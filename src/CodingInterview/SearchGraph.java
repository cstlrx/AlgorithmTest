package CodingInterview;

import edu.princeton.cs.algs4.In;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by lrx on 2017/3/9.
 */
// 图的广度遍历
class GraphNode {
    int val;

    public GraphNode(int val) {
        this.val = val;
        this.visited = false;
    }

    boolean visited;
}// 邻接表
class Graph {
    int v;// 节点数目
    int e;// 边数目
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
    // 获得相邻节点的数组
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
    // 广度优先搜索
    public static void search(Graph g) {
        
    }
    public static void main(String[] args) {
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
        g.addEdge(node1,node2);
        g.addEdge(node1,node3);
        g.addEdge(node2,node4);
        g.addEdge(node3,node5);
        Iterable<GraphNode> i = g.getAdj(node2);

        Iterator<GraphNode> ite = i.iterator();
        while (ite.hasNext()) {
            System.out.print(ite.next().val + " ");
        }


    }
}
