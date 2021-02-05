import java.util.*;
class Floyd_Warshall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int INF = 1000000000;
        int N = 4;
        int M = 7;
        int[][] AL = new int[N+1][N+1];
        int[] a = {1,1,2,2,3,3,4};
        int[] b = {2,4,1,3,1,4,3};
        int[] c = {4,6,3,7,5,4,2};
        for (int v = 0; v <= N; v++) {
            Arrays.fill(AL[v], INF);      // 전체 무한으로 초기화
        }
        for(int j = 1; j <= N; j++){
            for(int k = 1; k <= N; k++){
                if (j == k){    // 자기 자신으로 가는 경우 = 0
                    AL[j][k] = 0;
                }
            }
        }
        for(int i = 0; i < M; i++){
            AL[a[i]][b[i]] = c[i];
        }

        for(int l = 1; l <= N; l++){
            for(int q = 1; q <= N; q++){
                for(int w = 1; w <= N; w++){
                    AL[q][w] = Math.min(AL[q][w], AL[q][l] + AL[l][w]); // 바로 가는 것과 거쳐서 가는 것 중 더 빠른 방법 저장
                }
            }
        }
        for (int t = 1; t <= N; t++) {
            for (int g = 1; g <= N; g++) {
                if (AL[t][g] == INF) {
                    System.out.print("INFINITY ");
                }
                else {
                    System.out.print(AL[t][g] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}