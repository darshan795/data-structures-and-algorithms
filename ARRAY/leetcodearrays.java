package ARRAY;
public class leetcodearrays {
    public static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
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
    public static void main(String[]args){
        System.out.println("darshan");
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        lc26(arr);
        print(arr);

    }

}
