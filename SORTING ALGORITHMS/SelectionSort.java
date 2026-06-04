public class SelectionSort {
    public static void printarr(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        int n=arr.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            int min=arr[i];
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];

                }

            }
            System.out.println(min);
        }
    }
    public static void main(String[]args){
        System.out.println("darshan");
        int[] arr={5,4,3,2,1};
        printarr(arr);
        selectionSort(arr);
    }
}
