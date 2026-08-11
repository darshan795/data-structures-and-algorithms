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
        for(int i=0;i<n;i++){
            int min=arr[i],pos=i;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos=j;
                }
                // System.out.print(min+" at "+pos+" , ");
                
                
            }
            // System.out.println();
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
    
    }
    //insertion sort
    public static void insertionSort(int[] arr){
        int n=arr.length;
        System.out.println(n);   
        for(int i=0;i<n-1;i++){ 
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            printarr(arr);
        }
    }
    public static int lc169(int[] arr){//worst solutions
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            int maxCount=0;
            

            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;


                }
            }
            if(count>n/2 && count >maxCount)return arr[i];
            System.out.print(count+" ");
            System.out.println();
            System.out.print(maxCount);
        }
        return 0;

    }
    public static void optimizedInsertionSort(int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1){
                if(arr[j]>=arr[j-1])break;
                else{
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j--;
            }
        }
        

    }
    public static int lc169ii(int[]arr){

        return 0;

    }
    public static void main(String[]args){
        System.out.println("darshan");
        // int[] arr={5,4,2,3,1,6,7};
        int[] arr={2,2,1,1,1,2,2};
        int[] arr2={3,2,3};
        printarr(arr);

        
        
    }
}
