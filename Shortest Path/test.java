import java.util.*;

// ArrayList의 이해를 위해 사용한 파일 (배열에 class객체를 넣어서 사용함)

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    // 거리(비용)가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class test {
    public static int a, b = 0;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++) {
            graph.add(new ArrayList<Node>());
        }

        graph.get(0).add(new Node(a, b));
        System.out.println(graph.get(0).get(0).getIndex());
    }
}