class insertion_sort{
    public static void main(String[] args){
        int[] array = {7,5,9,0,3,1,6,2,4,8};
        int temp;
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        for(int k = 0; k < array.length; k++){
            System.out.print(array[k]);
        }
    }
}