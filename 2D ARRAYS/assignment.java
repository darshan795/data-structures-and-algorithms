public class assignment {
   
    public static void matrix_mul(int arr1[][],int arr2[][]){
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        int  n=arr1[0].length;
        int m=arr2.length;
        int res[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=0;
                for(int k=0;k<n;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
    //quesion number 1
    public static  void question1(int arr[][]){
        System.out.println("this question is to  print  the  diagonals elements only ");
        int n=arr.length;
        int m=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.print(arr[i][j]);
                }else if(i+j==n-1){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }

    public static void question2(int arr[][]){
        System.out.println("write a program to rotate  the matrix by 90 degrees anti-clockwise");
      
        int n=arr.length;
        int m=arr[0].length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
                

            }
            System.out.println();
        }
    }
        public static void question3(int  arr[][]){
        System.out.println("solution for the java is here");
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }else{
                 for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");

            }
        }
        }
    
    public static int[][] question4(int n){
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

    public static void main(String[]args){
        System.out.println("hereer it isss");
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        // matrix_mul(arr1, arr2);
        question3(arr2);
    }       
    }

