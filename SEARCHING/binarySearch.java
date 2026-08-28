package SEARCHING;
public class binarySearch{

    public static int  Search(int[]  arr,int key){
    //binary Search straight out of the leet code !!

    int l=0;
    int h=arr.length-1;
    while(l<h){
        int mid=(l+h)/2;
        System.out.println("the value of low is"+l);
        System.out.println("the value of the high is "+h);
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            l=mid+1;
        }else if(arr[mid]>key){
            h=mid-1;
        }
    }


        return -1;

    }


    public static int lowerbound(int[] arr,int key){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>key && arr[mid-1]<key){
                return mid-1;

            }else if(arr[mid]>key){
                j=mid-1;

            }else{
                i=mid+1;
            }
        }

        return -1;
    }


    public static void main(String[]args){
        System.out.println("Darshan");
        int[] arr={1,2,4,5,9,15,18,21,24};
        int result=lowerbound(arr, 8);
        System.out.println("successfully printed the result "+ result);

        

    }
}