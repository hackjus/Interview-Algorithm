package leetcode.Sort;

public class Sort {
    public void heapSort(int[]arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
  public void heapify(int[]arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
  }

    public static int[]  buddleSort(int []arr) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j+1]<arr[j]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int value:arr) {
            System.out.println(value);
        }
        return arr;
    }
    public static void inserSort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int inserValue=arr[i];
            while(j>0&&inserValue<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        }
    }
    public void mergeSort(int[]arr,int start,int end){
        int pivot;
        if(start<end){
            pivot=(start+end)/2;
            mergeSort(arr, start, pivot);
            mergeSort(arr, pivot + 1, end);
            merge(arr,start,pivot,end);
        }
    }
    public  void merge(int[]arr,int start,int pivot,int end){
        int i,j,k;
        int n1=pivot-start+1;
        int n2=end-pivot;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for( i=0;i<n1;i++)
            L[i] = arr[start+ i];
        for (j = 0; j < n2; j++)
            R[j] = arr[pivot + 1+ j];
        i=0;j=0;k=start;
        while (i<n1&&j<n2){
            if(L[i]<=R[j]) {
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1) {
            arr[k++]=L[i++];
        }
        while(j<n2) {
            arr[k++]=R[j++];
        }
    }
    public static void SelectSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            int min=arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){

                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1,10,9,2};
//        new 排序集合().heapSort(arr);
        buddleSort(arr);
    }
}
