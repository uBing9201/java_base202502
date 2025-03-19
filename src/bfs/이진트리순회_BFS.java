package bfs;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_BFS {

    static Node root;

    static void BFS(Node root) {
        // BFS는 재귀를 사용하지 않는다!
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {  // 큐가 비지 않았을 때만 반복
            int len = queue.size();
            System.out.println("level: " + level + ": ");
            for (int i = 0; i < len; i++) {
                Node curr = queue.poll();
                System.out.print(curr.data + " ");
                // 자식 있니? (lt, rt) 있다면 큐에 추가, 없으면 넘어가기

                if(curr.lt != null) queue.add(curr.lt);
                if(curr.rt != null) queue.add(curr.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);

    }

}
