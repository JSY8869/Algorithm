import java.util.*;

class Disjoint_Sets {
    public static int[] parent = new int[10000];
    public static int v, e;
    public static void main(String[] args){
        Disjoint_Sets temp = new Disjoint_Sets();
        Scanner sc = new Scanner(System.in);
        System.out.print("v : ");
        v = sc.nextInt();
        System.out.print("e : ");
        e = sc.nextInt();
        int a, b;
        for(int i = 1; i < v+1; i++){
            parent[i] = i;
        }
        System.out.println("노드 입력");
        for(int i = 0; i < e; i ++){
            a = sc.nextInt();
            b = sc.nextInt();
            temp.union_parent(a, b);
        }
        System.out.print("각 원소가 속한 집합");
        for(int i = 1; i < v+1; i++){
            System.out.print(temp.find_parent(i) + " ");      // 최종적인 부모를 출력하여 집합을 찾음
        }
        System.out.println();
        System.out.println("부모 테이블");
        for(int i = 1; i < v+1; i++){
            System.out.print(parent[i] + " ");      // 각 노드의 1번째 부모를 출력
        }
    }
    public int find_parent(int x){
        if (parent[x] != x){
            return find_parent(parent[x]);    // 부모가 자기자신이 아닌 경우 재귀를 통해 부모의 부모를 탐색
        }
        return x;      // 자기 자신이 부모인 경우
    }

    public void union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);
        if (a < b){
            parent[b] = a;
        }else{
            parent[a] = b;
        }
    }
}
