import java.util.*;

class Disjoint_Sets_Cycle {
    public static int[] parent = new int[10000];
    public static int v, e;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("v : ");
        v = sc.nextInt();
        System.out.print("e : ");
        e = sc.nextInt();
        int a, b;
        boolean cycle = false;
        for(int i = 1; i < v+1; i++){
            parent[i] = i;
        }
        System.out.println("노드 입력");
        for(int i = 0; i < e; i ++){
            a = sc.nextInt();
            b = sc.nextInt();
            if(find_parent(a) == find_parent(b)){ // a와 b의 부모가 같다 = 사이클 발생
                cycle = true;
                break;
            }else{
                union_parent(a, b);
            }
        }
        System.out.println(cycle);
    }
    public static int find_parent(int x){
        if (parent[x] != x){
            return find_parent(parent[x]);    // 부모가 자기자신이 아닌 경우 재귀를 통해 부모의 부모를 탐색
        }
        return x;      // 자기 자신이 부모인 경우
    }

    public static void union_parent(int a, int b){
        a = find_parent(a);
        b = find_parent(b);
        if (a < b){
            parent[b] = a;
        }else{
            parent[a] = b;
        }
    }
}
