// Last updated: 09/10/2026, 09:19:51
1import java.util.*;
2
3/*
4// Definition for a Node.
5class Node {
6    public int val;
7    public List<Node> neighbors;
8    public Node() {
9        val = 0;
10        neighbors = new ArrayList<Node>();
11    }
12    public Node(int _val) {
13        val = _val;
14        neighbors = new ArrayList<Node>();
15    }
16    public Node(int _val, ArrayList<Node> _neighbors) {
17        val = _val;
18        neighbors = _neighbors;
19    }
20}
21*/
22
23class Solution {
24    private Map<Node, Node> visited = new HashMap<>();
25
26    public Node cloneGraph(Node node) {
27        if (node == null) {
28            return null;
29        }
30
31        if (visited.containsKey(node)) {
32            return visited.get(node);
33        }
34
35        Node cloneNode = new Node(node.val);
36        visited.put(node, cloneNode);
37
38        for (Node neighbor : node.neighbors) {
39            cloneNode.neighbors.add(cloneGraph(neighbor));
40        }
41
42        return cloneNode;
43    }
44}