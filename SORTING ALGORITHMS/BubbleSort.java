class BubbleSort{

    public static void printarr(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    
    }

    public static void  bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }


            }
        }

    }
    public static void  efficientBubbleSort(int[] arr){
          int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println("number of  iterations");
            for(int j=0;j<n-1-i;j++){
                
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }


            }
            if(checkingSortedArray(arr)){
                break;
            }
        }
        
    }
    public static boolean checkingSortedArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])return false;
        }
        return true;
    }
    public static void stringSorting(String str){
            
            int n=str.length();
          
            String newstr="";
            for(int i=0;i<n;i++){
              
                if(str.charAt(i)>='X'){
                    newstr=newstr+str.charAt(i);
                }
            }
            System.out.println(newstr);
        
            
            char[] arr=newstr.toCharArray();
            int m=arr.length;
            System.out.println(m);
            for(int i=0;i<m-1;i++){
                for(int j=0;j<m-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        char temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            String sorted=new String(arr);
            System.out.println(sorted);
            
    }

    public static void  main(String[]args){
        int[] arr={5,1,2,3,4};
        System.out.println("darshan");
        String str="AZXYZXZAWERSDD";
        // System.out.println(str);
        stringSorting(str);

        

    }
}