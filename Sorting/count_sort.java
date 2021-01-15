public class count_sort{
    public static void main(String[] args){
        int[] array = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};
        int[] count = new int[array.length];
        for(int i = 0; i < array.length; i++){
            count[array[i]] += 1;
        }
        for(int j = 0; j < count.length; j++){
            for(int k = 0; k < count[j]; k++){
                System.out.print(j);
            }
        }
    }
}