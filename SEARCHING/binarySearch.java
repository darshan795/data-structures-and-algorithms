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

    public static int lc35(int[] arr ,int target){
         int n=arr.length;
        if(arr[n-1]<target){
            return n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return -1;

    }

    public static int lowerboundii(int[] arr,int target){
      //actual  solution   of  the lower bound 
      boolean flag=false;
      int i=0;
      int j=arr.length-1;
      while(i<=j){
        int mid=(i+j)/2;
        if(arr[mid]==target){
            flag=true;
            return arr[mid];

        }else if(arr[mid]>target){
            j=mid-1;
        }else{
            i=mid+1;
        }

      }
      if(!flag){
        return arr[j];
      }
      return -1;
    }

    public static void smallestmissing(int[] arr){
        int n=arr.length;
        //using  the  binarySearch we   will be solving this question
        boolean flag=false;
        for(int i=1;i<n;i++){
            if(arr[i]!=(arr[i-1]+1)){
                flag=true;
                System.out.println(arr[i-1]);
                System.out.println(arr[i-1]+1);
                System.out.println("the solution is  "+(arr[i-1]+1));
                break;
            }
        }
        if(!flag){
            System.out.println("it is not working man!!"+-1);
        }
    


    }

    //this is for first occurence
    public static void firstOccurence(int[] arr,int target){
     int n=arr.length;
     int  i=0;
     int j=n-1;
     boolean flag=false;
     while(i<=j){
        int mid=(i+j)/2;
        if(arr[0]==target){
            flag=true;
            System.out.println("here it is "+0);
            break;
        }
        if(arr[mid]==target){
            if(arr[mid-1]==target){
                j=mid-1;
            }else{
                flag=true;
                System.out.println("here it is "+(mid));
                break;
            }
        }else if(arr[mid]>target){
            j=mid-1;
        }else{
            i=mid+1;
        }

     }

     if(!flag){
        System.out.println(-1);
     }
    }

    //now for last occurence
    public static void lastOccurence(int arr[],int target){
        int i=0;
        int n=arr.length-1;
        int j=n-1;
        boolean flag=false;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                if(arr[mid+1]!=target){
                    flag=true;
                    System.out.println("we found the fucking upperbound"+mid);
                    break;
                }else{
                    i=mid+1;
                }


            }else if(arr[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        if(!flag){
            System.out.println(-1);
        }


    }

    public static void smallestmissingii(int[] arr){
        int n=arr.length;
        boolean flag=false;
        
    }

    public static void main(String[]args){
        System.out.println("Darshan");
        // int[] arr={1,2,4,5,9,15,18,21,24};
        // int result=lowerboundii(arr, 1);
        // System.out.println("successfully printed the result "+ result);
        // int[] arr={0,1,2,3,4,8,9,12};
        int [] arr={1,2,2,3,3,3,3,4,4,5,8,9,12};
        lastOccurence(arr, 12);

        

    }
}