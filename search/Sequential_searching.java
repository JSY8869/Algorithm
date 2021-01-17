import java.util.*;
class Sequential_searching{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("생성할 원소 개수를 입력하세요");
        int N = scanner.nextInt();
        System.out.println("찾을 원소를 입력하세요");
        String target = scanner.next();

        System.out.println("앞서 적은 원소의 개수만큼 문자열을 입력하세요. 띄어쓰기로 구분합니다.");
        String[] array = new String[N];
        for(int i = 0; i < N; i++){
            array[i] = scanner.next();
        }
        Sequential_searching model = new Sequential_searching();
        int result = model.sequential_search(N,target,array);
        System.out.println(result);
        scanner.close();
    }

    public int sequential_search(int N, String target, String[] array){
        for(int j = 0; j < N; j++){
            if(array[j].equals(target)){    //   java에서는 문자열을 '=='를 사용해서 비교할 수 없음
                return j+1;
            }
        }
        return 0;
    }
}