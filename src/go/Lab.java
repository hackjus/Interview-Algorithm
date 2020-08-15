package go;

public class Lab {
    public String name;
    public Lab() {
        System.out.println("sssss");
    }
    public  Lab(String name){
        this.name=name;
        System.out.println(name);
    }
    public void quickSort(int[]arr, int low, int high){
        int middle=low+(high-low)/2;
        int pivot=arr[middle];
        int i=low,j=high;
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        if(i<=high){
            quickSort(arr,i,high);
        }
        if(j>low){
            quickSort(arr,low,j);
        }
    }


  public static void main(String[] args) {
    //
      int[]arr={5,4,204,3,2,1,0};
      Lab one=new Lab("one");
      byte b1=1,b2=2,b3,b6;
      final byte b4=4,b5=6;
//      b3= b1+b2;
      one.quickSort(arr,0,arr.length-1);
      for(int a:arr){
          System.out.print(a+"_");
      }
  }
}
