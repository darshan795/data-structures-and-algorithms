import java.util.*;
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
   
    public static int lc169ii(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;



        

        
        return arr[n/2];
    }
    public static void replacewit1ton(int arr[]){
    int n=arr.length;
    int[] newarr=new int[n];
    printarr(newarr);
    int count=0;
    for(int i=0;i<n;i++){
        
        int min=Integer.MAX_VALUE;
        int pos=0;
        for(int j=0;j<n;j++){
            if(newarr[j]<0)continue;
            else{
                if(min>arr[j]){
                    min=arr[j];
                    pos=j;
                    
                }
            }
        }
        newarr[pos]=count;
        count--;

    }
    // for(int i=0;i<n;i++){
    //     newarr[i]=-newarr[i];
    // }
    printarr(newarr);



     

    }
    public static void lc455(int arr1[],int[]arr2){
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0;
        int count=0;
        while(i<n && j<m){
            if(arr2[j]>=arr1[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(count);

        
    }

    public static void main(String[]args){
        System.out.println("darshan");
     int[] arr1={1,2 };
     int[] arr2={1,2,3};
     lc455(arr1, arr2);




        
        
    }
}
