package org.example;

public interface Graph {
    void addVertex(String label);
    boolean addEdge(String startLabel, String secondLabel, int distance);
    int getSize();
    int findShortWay(String start, String end);
    void display();

    /**
     * англ. Depth-first search, DFS
     */
    void dfs(String startLabel);

    /**
     * англ. breadth-first search, BFS
     */
    void bfs(String startLabel);

}
