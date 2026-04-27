import java.util.Random;

public class Sorter {
    //Selection Sort - O(n^2)
    public void basicSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    //Merge Sort - O(n logn)
    public void advancedSort(int[] arr){
        if(arr.length< 2) {
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    private void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left, mid, right);
        }
    }
    private void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L= new int[n1];
        int[] R=new int[n2];
        System.arraycopy(arr,left,L,0,n1);
        System.arraycopy(arr,mid+1,R,0,n2);

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }

    public void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public int[] generateRandomArray(int size){
        int[] arr = new int[size];
        Random rand = new Random();
        for(int i=0;i<size;i++){
            arr[i]= rand.nextInt(10000);//Random numbers up to 10k
        }
        return arr;
    }
}
