class selection_sort {
    public static void main(String[] args){
        int[] array = {7,5,9,0,3,1,6,2,4,8};
        int temp;
        for(int i = 0; i < array.length; i++){
            int min_index = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min_index] > array[j]){
                    min_index = j;
                }
            }
        temp = array[i];
        array[i] = array[min_index];
        array[min_index] = temp;    
        }
        for(int k = 0; k < array.length; k++){
            System.out.print(array[k]);
        }
    }
}
