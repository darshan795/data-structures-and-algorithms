import java.util.*;

public class pratice{

    //this is the way we  have to do it motherfucker!!
    
    public   static void reverse(int[]arr){
        int n=arr.length;
        System.out.println(n);
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


    }
   public static void sortingzero(int[]arr){
    int n=arr.length;
    int i=0;
    int j=n-1;
    while(i<j){
        if(i>j)break;
    if(arr[i]==0){
        i++;
    }if(arr[j]==1){
        j--;
    }if(arr[i]==1 && arr[j]==0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;    

    }
}

    
   }
   public static void dutchalgo(int[]arr){
    int n=arr.length;
    int i=0;
    int j=0;
    int k=n-1;
    while(j<k){
        if(arr[j]==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
        }if(arr[j]==2){
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            k--;
            
        }if(arr[j]==1){
            j++;
        }

    }


   }
   public static int[] merge(int[]arr1,int[] arr2){

    int n1=arr1.length;
    int n2=arr2.length;
    int i=0,j=0;
    int k=0;
    int[] arr=new int[n1+n2];
    while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        else{
            arr[k]=arr2[j];
            k++;
            j++;
        }

    }
    while(i<n1){
        arr[k]=arr1[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k]=arr2[j];
        j++;
        k++;
        
    }
    return arr;
    
   }
    public static void print(int[] arr){

        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    // 2 d's arrays that ...

    public static void print2d(int[][] arr){
        int n=arr.length;
        System.out.println("the matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] transpose(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] newarr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int  j=0;j<n;j++){
                newarr[i][j]=arr[j][i];

            }
        }
        return  newarr;

    }
    public static void transposeii(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=arr[i][j];
                     arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

    }
    public static void rotate90(int[][] arr){
        //here we will focus on the rotate 90 degreee..
        //reversing the arrays;
        transposeii(arr);
         int n=arr.length;
         for(int i=0;i<n;i++){
            int m=arr[i].length;
            int j=0;
            int k=m-1;
            while(j<k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }        


         }
    }

    public static int[][] multiplication(int[][]arr){
        int n=arr.length;
        int[][] arr1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    arr1[i][j]+=arr[i][k]*arr[k][j];
                }
            }
        }



        return arr1;

    }
    public static void zigzag(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2!=0){
                    System.out.print(arr[i][n-j-1]);
                }else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println(" ");
        
        }
    }
        public static void spiralmatrix(int[][] arr){
            int n=arr.length;
            int minr=0,minc=0;
            int maxr=n-1,maxc=n-1;
            while(minr<maxr && minc<maxc){
                //first one is top to right;
                for(int i=minc;i<=maxc;i++){
                    System.out.print(arr[minr][i]+" ");
                } minr++;
    
                //top to down
                for(int i=minr;i<=maxr;i++){
                    System.out.print(arr[i][maxc]+" ");
                }maxc--;
            

                //right to  left;
                for(int i=maxc;i>=minc;i--){
                    System.out.print(arr[maxr][i]+ " ");
                }maxr--;
                
                for(int i=maxr;i>=minr;i--){
                    System.out.print(arr[i][minc]+" ");
                }minc++;
            
            }
        }
        public static ArrayList<ArrayList<Integer>> pascal(int n){
            ArrayList<ArrayList<Integer>>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new ArrayList<>());
                for(int j=0;j<i+1;j++){
                    list.get(i).add(0);
                }

            }
        
            for(int  i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    if(i==j || j==0){
                        list.get(i).set(j,1);
                    }else{
                        list.get(i).set(j,list.get(i-1).get(j)+list.get(i-1).get(j-1));
                    }
                }
            }

            return list;
            
        }
    public static void main(String[]args){
        System.out.println("darshan");
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=5;
        ArrayList<ArrayList<Integer>>list=pascal(5);
        System.out.println(list);

     
        

     

        
    
      

    }
}