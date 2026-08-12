
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
     public static void reverse(int arr[]){
        //using two pointers aproach to reverse the arrays
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }


     }
     public static void reversepart(int arr[],int i,int j){
          while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        
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
    public static void sorting0and1(int[] arr){
        System.out.println(arr[0]);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            
            if(arr[i]==0)i++;

            else if(arr[j]==1)j--;
            else if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
    }
    public static void  lc189(int arr){
        //rotate the given array by k steps motherfuckr
        


    }
    public static void lc75(int[] arr){
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<k){
            // if(arr[i]==0)i++;
            // if(arr[j]==1)j++;
            // if(arr[k]==2)k--;
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            

            }
              if(arr[j]==2){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;
                j++;
            

            }

        }
        

    }
    public static void main(String[]args){
        System.out.println("darshan");
        int[] arr={2,0,2,1,1,0};

        print(arr);
        lc75(arr);
        print(arr);


     
        
       

    }

}
