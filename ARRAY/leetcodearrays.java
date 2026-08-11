
public class leetcodearrays {
    public static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] lc1(int arr[],int target){
        System.out.println("darshan");
        int n=arr.length;
        int[] newarr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    newarr[0]=i;
                    newarr[1]=j;
                }
            }
        }
        return newarr;
        
    }
    public static void lc11(int arr[]){
        

    }
    public static void lc26(int arr[]){
        System.out.println("remove the  duplicates in the  sorted arrays  i gueess");
        int n=arr.length;
        int i=0;
        int j=1;  
        int count=0;  
        while(j<n-1){
            if(arr[i]==arr[j])j++;
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
                count++;
            }
        }
        System.out.println("the  count is :"+count );
        

    }
    public static void  lc283(int[] arr){
        //two things i  have to do use the 
        //2 pointer approach // 
        //more one move the pointer such that it will be sorted array in teh same 
        //relative version will be the same
        //this is the case that we have to do and move on   
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                j++;
            }if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
          

        }
        
        

    }
    public static void main(String[]args){
        System.out.println("darshan");
        int[] arr={2,7,11,15};
        int[] arr1={3,2,4};
        int target1=6;


        print(arr);
        // lc283(arr);
        int target=9;
        int result[]=lc1(arr,target);
        int result1[]=lc1(arr1,target1);
        print(arr);
        print(result1);

        
       

    }

}
