public class leetcode{
    
    

    public static void print(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void matrix_multiplication(int arr1[][],int arr2[][]){
            
    }
  
    public static void lc48(int arr[][]){
        print(arr);
        int  n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=temp;

            }
        }
        print(arr);
        transposetransform(arr);
        print(arr);
    }


    public static void transposetransform(int arr[][]){
        int a=arr.length;
        int b=arr.length;
        System.out.println(a+b);
       
          for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(j>i){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                                }
            }
        }
         for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        
    }

    public static void lc867(int arr[][]){
        int arr1[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=arr[j][i];
            }

        }
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }

        }
        



    }
      public static void waveprinting(int arr[][]){
        System.out.println("darshan");
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                    
                }else{
                    System.out.print(arr[i][n-j-1]+" ");
                }
            }
        }
        
    }
    public static void lc54(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=m-1;
        int count=0;
        int no=m*n;
        while(minr<=maxr && minc<=maxc){
            for(int i=minc;i<=maxc && count<no;i++){
                System.out.print(arr[minr][i]);
            }minr++;
            for(int i=minr;i<=maxr && count<no;i++){
                System.out.print(arr[i][maxc]);
            }maxc--;
            for(int i=maxc;i>=minc && count<no;i--){
                System.out.print(arr[maxr][i]);
            }maxr--;
            for(int i=maxr;i>=minr && count<no;i--){
                System.out.print(arr[i][minc]);
            }minc++;
        }
        
             
    }
    public static int[][] lc59(int n){
        int arr[][]=new int[n][n];
        int counter=1;
        int minr=0,minc=0;
        int maxr=n-1,maxc=n-1   ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //for left to right
                for(int k=minc;k<=maxc && counter<=n*n;k++){
                    arr[minr][k]=counter;
                    counter++;

                }minr++;

                //for down 
                for(int k=minr;k<=maxr && counter<=n*n;k++){
                    arr[k][maxc]=counter;
                    counter++;
                }maxc--;
                //right to left
                for(int k=maxc;k>=minc && counter<=n*n;k--){
                    arr[maxr][k]=counter;
                    counter++;



                }maxr--;
                for(int k=maxr;k>=minr && counter<=n*n;k--){
                    arr[k][minc]=counter;
                    counter++;

                }minc++;

                
            }
        }
        return arr;

    }
    public static void lc118(int arr[][]){
        System.out.println("darshan");
    }
    
    public static void main(String[]args){
        System.out.println("hello world.");
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // for(int i=0;i<arr[i].length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.println(arr[j][i]);
        //     }
        // }    
        // lc867(arr);
        // transposetransform(arr);
        // lc48(arr);
        // waveprinting(arr2);
    //    int result[][]= lc59(3);
    lc118(arr);

       
    //    print(result);


        
    }
}