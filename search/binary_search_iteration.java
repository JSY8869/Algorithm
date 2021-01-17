class binary_search_iteration{
    public static void main(String[] args){
        int n = 10;
        int target = 7;
        int[] array = {1,3,6,7,10,11,13,16,17,20};      // array를 오름차순으로 정렬해서 넣어야 함
        int result;
        binary_search_recursion bsr = new binary_search_recursion();
        result = bsr.binary_search(array, target, 0, n-1);
        if (result == 0){
            System.out.println("찾으시는 값이 없습니다.");
        }
        else{
            System.out.println(result+1);
        }
    }
    public int binary_search(int[] array, int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(array[mid] == target){         // 탐색 성공
                return mid;
            }
            else if(array[mid] > target){        // 중간값이 찾으려는 값보다 큰 경우 시작점부터 중간값-1까지 재탐색
                end = mid - 1;
            }
            else{                        // 중간값이 찾으려는 값보다 작은 경우 끝점부터 중간값+1까지 재탐색
                start = mid + 1;
            }
        }
        return 0;    // 탐색 실패
    }
}