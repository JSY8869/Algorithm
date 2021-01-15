class quick_sort {
    public static void main(String[] args){
        int[] array = {7,5,9,0,3,1,6,2,4,8};
        quick_sort QS = new quick_sort();
        QS.QuickSort(array, 0, (array.length)-1);
        for(int k = 0; k < array.length; k++){
            System.out.print(array[k]);
        }
    }
    public void QuickSort(int[] array, int start, int end){
        int temp;
        if(start >= end){
            return;
        }
        int pivot = start; // 피벗은 첫 번째 원소
        int left = start + 1;
        int right = end;
        while(left <= right){
            while(left <= end && array[left] <= array[pivot]){
                left += 1;
            }
            while(right > start && array[right] >= array[pivot]){
                right -= 1;
            }
            if(left > right){
                temp = array[right];
                array[right] = array[pivot];
                array[pivot] = temp;
            }
            else{
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            QuickSort(array, start, right-1);
            QuickSort(array, right+1, end);
        }
    }
}
