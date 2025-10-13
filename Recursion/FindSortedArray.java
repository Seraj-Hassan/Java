public class FindSortedArray {
    public static boolean  sortedArray(int arr[],int idx){
        if(idx == arr.length-1){
            return true;

        }
        if(arr[idx] < arr[idx+1]){
            return sortedArray(arr, idx+1);

        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,4};
        System.out.println(sortedArray(arr, 0));
        
    }
    
}
