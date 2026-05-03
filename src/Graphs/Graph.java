package Graphs;

import java.util.*;

public class Graph<V> {
    Map<V, Set<V>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(V vertex) {
        adjList.putIfAbsent(vertex, new HashSet<>());
    }

    // for undirected graph
    public void addEdge(V source, V destination) {
        // put an empty HashSet if the vertex isn't already present in the graph
        adjList.putIfAbsent(source, new HashSet<>());
        adjList.putIfAbsent(destination, new HashSet<>());

        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void addDirectedEdge(V source, V destination) {
        adjList.putIfAbsent(source, new HashSet<>());
        adjList.putIfAbsent(destination, new HashSet<>());

        adjList.get(source).add(destination);
    }

    public void removeEdge(V source, V destination) {
        Set<V> sourceList = adjList.get(source);
        Set<V> destinationList = adjList.get(destination);

        if (sourceList != null) {
            sourceList.remove(destination);
        }

        if (destinationList != null) {
            destinationList.remove(source);
        }
    }

    // undirected graph
    public void removeVertex(V vertex) {
        if (!adjList.containsKey(vertex)) {
            return;
        }
        Set<V> neighborsList = adjList.get(vertex);
        for (V neighbor : neighborsList) {
            adjList.get(neighbor).remove(vertex);
        }
        adjList.remove(vertex);
    }

    // Breadth first search in a connected undirected graph
    public void bfs(V vertex) {
        if (!adjList.containsKey(vertex)) {
            System.out.println("Vertex not found!");
            return;
        }
        Set<V> visited = new HashSet<>();
        Queue<V> queue = new ArrayDeque<>();
        queue.add(vertex);
        visited.add(vertex);
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " -> ");
            Set<V> neighborsList = adjList.get(queue.poll());
            for (V neighbor : neighborsList) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println("End");
    }

    // Depth first search in connected undirected graph
    public void dfs(V vertex) {
        Set<V> visited = new HashSet<>();
        Deque<V> stack = new ArrayDeque<>();

        stack.push(vertex);

        /* =========================================================================
         * APPROACH 1: "True DFS" (Mark AFTER popping)
         *
         * How it works: Nodes are marked 'visited' ONLY when popped off the stack.
         * Pros: Perfectly mimics a recursive DFS. It guarantees we dive down the
         *       deepest paths first before backtracking. You must use this approach
         *       for pathfinding, topological sorting, or cycle detection.
         * Cons: The stack might temporarily hold duplicate nodes (if a node is
         *       reachable via multiple paths before it gets popped).
         * ========================================================================= */

        while (!stack.isEmpty()) {
            V current = stack.pop();
            if (!visited.contains(current)) {
                System.out.print(current + " -> ");
                visited.add(current);
                Set<V> neighborsList = adjList.get(current);
                if (neighborsList != null) {
                    for (V neighbor : neighborsList) {
                        if (!visited.contains(neighbor)) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
        /* =========================================================================
         * APPROACH 2: "Pseudo-DFS" (Mark BEFORE pushing)
         *
         * How it works: Neighbors are marked 'visited' the moment they are pushed.
         * Pros: Prevents duplicate nodes from entering the stack, which saves a
         *       small amount of memory. Great for simply traversing all nodes
         *       (e.g., counting connected components).
         * Cons: Loses the strict "Depth First" traversal order. Nodes higher up
         *       prematurely "claim" deeper nodes, blocking off deep paths and
         *       forcing the algorithm to backtrack early.
         * Note: Remember to mark the starting vertex as visited before the loop
         *       if using this approach! (visited.add(vertex))
         * ========================================================================= */
//        visited.add(vertex);
//        while (!stack.isEmpty()) {
//            V current = stack.pop();
//            System.out.print(current + " -> ");
//            Set<V> neighborsList = adjList.get(current);
//            if (neighborsList != null) {
//                for (V neighbor : neighborsList) {
//                    if (!visited.contains(neighbor)) {
//                        stack.push(neighbor);
//                        visited.add(neighbor);
//                    }
//                }
//            }
//        }
        System.out.println("End");
    }

    public void dfsRecursive(V vertex) {
        Set<V> visited = new HashSet<V>();
        dfsHelper(vertex, visited);
        System.out.println("End");
    }

    private void dfsHelper(V vertex, Set<V> visited) {
        if (visited.contains(vertex)) {
            return;
        }
        System.out.print(vertex + " -> ");
        visited.add(vertex);
        for (V neighbor : adjList.get(vertex)) {
            dfsHelper(neighbor, visited);
        }
    }

    public boolean hasPath(V source, V destination) {
        Set<V> visited = new HashSet<>();
        Queue<V> queue = new LinkedList<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            V current = queue.poll();

            // safely get neighbors list to avoid null pointer exception
            for (V neighbor : adjList.getOrDefault(current, Collections.emptySet())) {
                if (neighbor.equals(destination)) {
                    return true;
                }
                // Mark visited immediately to prevent duplicates in the queue
                if (!visited.contains(neighbor)) {
                    visited.add(current);
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }

    public int connectedComponents() {
        Set<V> visited = new HashSet<>();
        int count = 0;

        for (V vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                Deque<V> stack = new ArrayDeque<>();
                stack.push(vertex);
                visited.add(vertex);
                while (!stack.isEmpty()) {
                    V current = stack.pop();
                    for (V neighbor : adjList.getOrDefault(current, Collections.emptySet())) {
                        if (!visited.contains(neighbor)) {
                            visited.add(neighbor);
                            stack.push(neighbor);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }

    public boolean hasCycleRecursive() {
        Set<V> visited = new HashSet<>();
        for (V vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                if (dfsCycleRecursive(vertex, visited, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsCycleRecursive(V vertex, Set<V> visited, V parent) {
        visited.add(vertex);
        for (V neighbor : adjList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                if (dfsCycleRecursive(neighbor, visited, vertex)) {
                    return true;
                }
            } else if (!neighbor.equals(parent)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle() {
        Set<V> visited = new HashSet<>();
        for (V vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                if (dfsCycle(vertex, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsCycle(V current, Set<V> visited) {
        Stack<Pair<V>> stack = new Stack<>();
        Pair<V> pair = new Pair<>(current, null);
        stack.push(pair);
        visited.add(current);

        while (!stack.isEmpty()) {
            Pair<V> currentPair = stack.pop();
            current = currentPair.node;
            V parent = currentPair.parent;
            for (V neighbor : adjList.getOrDefault(current, Collections.emptySet())) {
                if (!visited.contains(neighbor)) {
                    stack.push(new Pair<>(neighbor, current));
                    visited.add(neighbor);
                } else if (!neighbor.equals(parent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void display() {
        for (V key : adjList.keySet()) {
            System.out.println(key + " -> " + adjList.get(key));
        }
    }
}

class Pair<V> {
    V node;
    V parent;

    public Pair(V node, V parent) {
        this.node = node;
        this.parent = parent;
    }
}

class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "E");
        graph.addEdge("C", "E");
        graph.addEdge("E", "F");
        graph.addEdge("G", "H");
        graph.bfs("A");
        graph.dfs("A");
        graph.dfsRecursive("A");
        System.out.println(graph.hasPath("A", "F"));
        System.out.println(graph.hasPath("A", "G"));
        System.out.println("Number of connected components : " + graph.connectedComponents());
        System.out.println("Has Cycle : " + graph.hasCycleRecursive());
    }
}