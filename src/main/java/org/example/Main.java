package org.example;

public class Main {
    public static void main(String[] args) {
//        testGraph();
//        testDfs();
//        testBfs();
        testFindShortWay();
    }

    private static void testFindShortWay() {
        Graph graph = new GraphImpl(10);

        graph.addVertex("Moscow");
        graph.addVertex("Tula");
        graph.addVertex("Ryazan");
        graph.addVertex("Kaluga");
        graph.addVertex("Lipetsk");
        graph.addVertex("Tambow");
        graph.addVertex("Orel");
        graph.addVertex("Saratov");
        graph.addVertex("Kursk");
        graph.addVertex("Voronezh");

        graph.addEdge("Moscow", "Tula", 12);
        graph.addEdge("Moscow", "Ryazan", 32);
        graph.addEdge("Moscow", "Kaluga", 44);
        graph.addEdge("Tula", "Lipetsk", 20);
        graph.addEdge("Ryazan", "Tambow", 100);
        graph.addEdge("Kaluga", "Orel", 15);
        graph.addEdge("Lipetsk", "Voronezh", 922);
        graph.addEdge("Tambow", "Saratov", 101);
        graph.addEdge("Orel", "Kursk", 421);
        graph.addEdge("Saratov", "Voronezh", 10);
        graph.addEdge("Kursk", "Voronezh", 150);

        System.out.println("Size of graph is " + graph.getSize());

        graph.display();
        graph.findShortWay("Moscow", "Voronezh");
    }

//        private static void testGraph() {
//
//        Graph graph = new GraphImpl(7);
//
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//
//        graph.addEdge("A", "B", 5);
//        graph.addEdge("B", "C", 15);
//        graph.addEdge("C", "A", 20);
//        graph.addEdge("D", "B", 1);
//
//        System.out.println("Size of graph is ");
//        System.out.println("Size of graph is " + graph.getSize());
//        graph.display();
//    }
//
//    private static void testDfs() {
//        Graph graph = new GraphImpl(7);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//
//        graph.addEdge("A", "B", 5);
//        graph.addEdge("B", "E", 7);
//        graph.addEdge("D", "F", 1);
//        graph.addEdge("F", "G", 3);
//
//        graph.dfs("A");
//    }
//
//    private static void testBfs() {
//        Graph graph = new GraphImpl(8);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//        graph.addVertex("H");
//
//        graph.addEdge("A", "B", 9);
//        graph.addEdge("B", "E", 10);
//        graph.addEdge("E", "H", 51);
//        graph.addEdge("C", "F", 20);
//        graph.addEdge("D", "G", 30);
//
//        graph.bfs("A");
//    }
}