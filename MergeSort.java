public class MergeSort {

    static void mergeSort(int a[] , int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(a , left , mid);
            mergeSort(a, mid+1 , right);
            //배열 기준으로 왼, 오른쪽으로 분할
            merge(a, left ,mid, right);
        }
    }

     static void merge(int[] a, int left , int mid ,int right){
         int i = left;
         int j = mid+1;
         int k = left;
         int temp[] =  new int[a.length];

         while(i<= mid && j <= right){
             if(a[i] < a[j]){
                temp[k++] = a[i++];
             }
             else{
                 temp[k++] = a[j++];
             }
         }

         while(i<=mid){
             temp[k++] = a[i++];
         }
         while(j<=right){
            temp[k++] = a[j++];
         }

         for(int idx = left ; idx <= right ; idx++){
             a[idx] = temp[i];
         }
     }

    public static void main(String[] args) {
        int arr[] = {6,3,3,7,1,21,3,7,2,25};
        mergeSort(arr, 0, arr.length - 1);
    }
}
